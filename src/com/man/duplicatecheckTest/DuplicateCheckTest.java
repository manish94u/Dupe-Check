package com.man.duplicatecheckTest;

import static org.junit.Assert.fail;

import java.util.List;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.man.duplicatecheck.DuplicateCheck;

public class DuplicateCheckTest {

	DuplicateCheck dpc = new DuplicateCheck();
	String strEmpty[] = {};
	String strNull[] = null;
	String strDupes[] = {"Man","Man","Abc","123","XYZ","Abc"};
	String strNoDupes[] = {"Man","Abc","123","XYZ"};
	@Test
	public void testGetDuplicate() {
		List<String> strList = dpc.getDuplicate(strDupes);
		Assert.assertEquals("Test failed - Algorithm wrongly implemented. Expecting Size of list 2 with String 'Man' & 'Abc'",2,strList!=null&&strList.size()==2?(strList.get(0).equals("Man")&&strList.get(1).equals("Abc")?2:-1):strList.size() );
		
	}
	

	@Test
	public void testGetDuplicateNullHandler() {
		List<String> list = dpc.getDuplicate(strNull);
		Assert.assertTrue("List cannot be null, only size could be 0", list!=null && list.size()==0);
	}

	@Test
	public void testGetDuplicateEmptyHandler() {
		List<String> list = dpc.getDuplicate(strEmpty);
		Assert.assertTrue("List cannot be null, only size could be 0", list!=null && list.size()==0);
	}
	@Test
	public void testGetDuplicateNoDupesHandler() {
		List<String> list = dpc.getDuplicate(strNoDupes);
		Assert.assertTrue("Algorithm implemented is wrong, size should be 0!!", list!=null && list.size()==0);
	}

}

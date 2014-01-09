package com.man.duplicatecheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCheck {

	/**
	 * @param args
	 */
	static String[] str = {"abc","abc","def","def","123"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCheck dpc = new DuplicateCheck();
		List<String> list = dpc.getDuplicate(str);
		dpc.printString(list);
	}
	
	public List<String> getDuplicate(String[] strs){
		if(strs==null || strs.length==0){
			return Collections.emptyList();
		}else{
			List<String> duplicateStr = new ArrayList<String>();
			Map<String,Integer> map = new HashMap<String,Integer>();
			for(String str:strs){
				Integer val = map.get(str);
				if(val==null){
					map.put(str,1);
				}else{
					duplicateStr.add(str);
				}
			}
			return duplicateStr;
		}
		
		 
	}
	
	public void printString(List<String> listStr){
		if(listStr!=null)
		for(String str:listStr){
			System.out.print(str+"||");
		}
	}
}

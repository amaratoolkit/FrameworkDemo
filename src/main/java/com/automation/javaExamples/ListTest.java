package com.automation.javaExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListTest {
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		
		String arr[] = {"India", "Pak", "Nepal", "Ban", "Sri"};
		int aar1[] = {11, 12, 13, 14, 15};
		
		ArrayList arrayList= new ArrayList();
		arrayList.add("India");
		arrayList.add("Pak");
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add("India");
		
		System.out.println("array list ====" + arrayList);
		
		
		HashSet hashSet = new HashSet(); 
		hashSet.add("India");
		hashSet.add("Pak");
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add("India");
		
		System.out.println("hash set list ====" + hashSet);
		
		
		HashMap map=new HashMap();  
		map.put(1, "India");
		map.put(2, "Pak");
		map.put(3, "Nepal");
		
		System.out.println("Map ====="+ map);
	}

}

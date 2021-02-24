package com.automation.javaExamples;

import org.testng.annotations.Test;

public class ForEachLoop {
	 int[] arr = {'1','2','3','4','5'};
	 int[] arr1 = {1,2,3,5,7};
	 
	 char[] names = {'a','b','c','d'};
	 String[] names1 = {"aaaa","bbbb","cccc","dddd"};
	
	@Test
	public void forEachLoop() {
		for (String j : names1) {
			//System.out.println(j);
			System.out.println(j);
		}
	}
	
	@Test
	public void whileLoop() {
		int i=1;  
	    while(i<=10){  
	        System.out.println(i);  
	    i++;  
	    }  
	}
	
	@Test 
	public void doLoop() {
		  int i=1;  
		    do{  
		        System.out.println(i);  
		    i++;  
		    }while(i<=10);  
	}
}

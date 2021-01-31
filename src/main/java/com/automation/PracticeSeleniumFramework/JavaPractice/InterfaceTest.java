package com.automation.PracticeSeleniumFramework.JavaPractice;

public class InterfaceTest implements Interface1, Interface2{

	
	public void test1() {
		System.out.println("test1");
		
	}


	public void test2() {
		System.out.println("test2");
		
	}


	public void test3() {
		System.out.println("test3");
		
	}


	public void test4() {
		System.out.println("test4");
		
	}
	
	
	public static void main(String[] args) {
		InterfaceTest it = new InterfaceTest();
		it.test1();
		it.test2();
		it.test3();
		it.test4();
		
	}
	

}

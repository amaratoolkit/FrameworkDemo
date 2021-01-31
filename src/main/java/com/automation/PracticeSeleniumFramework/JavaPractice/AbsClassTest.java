package com.automation.PracticeSeleniumFramework.JavaPractice;

public class AbsClassTest extends AbstractClass {
	
	public void test1() {
		System.out.println("Abstrcat method implemented");
	}
	
	public static void main(String[] args) {
		AbsClassTest at = new AbsClassTest();
		at.test1();
		at.test2();
	}

	

}

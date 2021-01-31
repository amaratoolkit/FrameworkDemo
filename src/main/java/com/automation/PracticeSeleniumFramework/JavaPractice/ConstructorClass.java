package com.automation.PracticeSeleniumFramework.JavaPractice;

public class ConstructorClass {
	

	public ConstructorClass(int a, int b) {
		System.out.println("sum of a & b is "+ (a+b));
	}
	
	public ConstructorClass(int a, int b, int c) {
		System.out.println("sum of a & b & c is "+ (a+b+c));
	}
	
	public ConstructorClass(int id, String name) {
		System.out.println("My name is "+ name + " and my id "+ id);
	}
	
	public static void main(String[] args) {
		ConstructorClass cc = new ConstructorClass(10, "Java");
		ConstructorClass cc1 = new ConstructorClass(10, 10, 10);
		ConstructorClass cc2 = new ConstructorClass(10, 10);
		
		
		
		
	}
}

package com.automation.PracticeSeleniumFramework.JavaPractice;

public class ChildClass extends ParentClass {
	
	public void parentMethod() {
		System.out.println("Child Method");
	}
	

	public void sum(int a, int b) {
		int c = a+b;
		
		System.out.println("c value is "+ c);
	}
	
	public void sum(int a, double b) {
		double c = a+b;
		
		System.out.println("c value is "+ c);
	}
	
	public void sum(int a, int b, int c) {
		int d = a+b+c;
		
		System.out.println("d value is "+ d);
	}
	
	public static void main(String args[]) {
		ChildClass cc = new ChildClass();
		
		cc.parentMethod();
		cc.sum(10, 10, 10);
		cc.sum(10, 20.4);
		cc.sum(10, 30);
		
	}

}

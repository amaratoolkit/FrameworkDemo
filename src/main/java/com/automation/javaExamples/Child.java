package com.automation.javaExamples;

public class Child extends Parent{
	
	public void childMethod() {
		System.out.println("Child method");
		
	}
	
	public void sum(int a, double b) {
		double c = a+b;
		System.out.println("c value is "+ c);
	}
	
	public void sum(int a, int b, int c) {
		int d  = a+b+c;
		System.out.println("d value is "+ d);
	}
	
//	public void sum(int a, int b) {
//		int c = a+b;
//		System.out.println("c value is "+ c);
//	}
	
	
	public static void main(String args[]) {
		Child cl = new Child();
		cl.sum(10, 10);
		cl.sum(10, 20.6);
		cl.sum(10, 10, 10);
	}

}

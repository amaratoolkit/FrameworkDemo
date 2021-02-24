package com.automation.javaExamples;

public class AbsClass1 extends AbstractClass1{
	
	public static void main(String[] args) {
		AbsClass1 abs = new AbsClass1();
		abs.test1();
		abs.test2();
	}
	
	public void test2() {
		System.out.println("Abstract Test2");
	}

}

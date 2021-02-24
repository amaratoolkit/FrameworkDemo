package com.automation.javaExamples;

public class TestInterface implements Interface1, Interface2 {

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
		TestInterface ti = new TestInterface();
		ti.test1();
		ti.test2();
		ti.test3();
		ti.test4();
		
	}
}

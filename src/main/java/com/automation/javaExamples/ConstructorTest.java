package com.automation.javaExamples;

public class ConstructorTest {

	public ConstructorTest(int a, int b) {
		System.out.println("Sum of a plus b is " + (a + b));
	}

	public ConstructorTest(int a, String b) {
		System.out.println("My name is " + b + "my number " + a);
	}
	
	
	public static void main(String args[]) {
		ConstructorTest cc = new ConstructorTest(10, 10);
		ConstructorTest cc1 = new ConstructorTest(10, "Java");
		
	}
	

}

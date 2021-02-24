package com.automation.javaExamples;

public class ThisAndSuper extends Parent{
	
	String name;
	int age; 
	
	public ThisAndSuper(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void test() {
		System.out.println("My name is " + name + " and my age is " + super.age);
		super.testParent();
	}
	
	public static void main(String[] args) {
		ThisAndSuper ts = new ThisAndSuper("Aadya", 3);
		ThisAndSuper ts1 = new ThisAndSuper("Amara", 1);
		ts.test();
		ts1.test();
		
	}

}

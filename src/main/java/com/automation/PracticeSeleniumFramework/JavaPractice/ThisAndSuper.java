package com.automation.PracticeSeleniumFramework.JavaPractice;

public class ThisAndSuper extends ParentClass{
	
	String name;
	int age;
	
	
	public ThisAndSuper(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void test() {
		System.out.println("My name is "+ name + " my age is "+ super.age);
		super.parentMethod();
	}
	
	
	public static void main(String[] args) {
		ThisAndSuper ts = new ThisAndSuper("Aadya", 3);
		ThisAndSuper ts1 = new ThisAndSuper("Amara", 1);
		ts.test();
		ts1.test();
		
	}
	
}

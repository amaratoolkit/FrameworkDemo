package com.automation.PracticeSeleniumFramework.JavaPractice;

import org.testng.annotations.Test;

public class JavaPractice {
	
	public static void main(String args[]) {
		JavaPractice jp = new JavaPractice();
		jp.addition(10, 10);
	}
	
	
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println("c value is "+ c);
	}
	
}

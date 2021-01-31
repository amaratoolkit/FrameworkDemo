package com.automation.PracticeSeleniumFramework.JavaPractice;

import org.testng.annotations.Test;

public class RunTimeException {

	@Test
	public void testException() {
		int a;

		try {
			a = 5 / 0;
			System.out.println("a value is "+ a);
		} catch (Exception e) {

			//System.out.println("Arthematic exception");
			//e.printStackTrace();
			a = 5/5;
			System.out.println("a value is "+ a);
		} finally {
			System.out.println("Finally block");
		}
	}

}

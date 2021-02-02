package com.automation.PracticeSeleniumFramework.JavaPractice;

import org.testng.annotations.Test;

public class LoopsAndConditions {

	public int age = 18;
	public String test = "Smoke";
	public String[] arr = {"Smoke", "Sanity", "Comptabilty"};
	public int[] arr1 = {1,2,3,4,5};

	// @Test
	public void ifCondition() {

		if (age < 18) {
			System.out.println("Not Eleigible for applying Driver licence");
		} else if (age == 18) {
			System.out.println("Eleigible for applying Driver licence");

			if (age < 18) {
				System.out.println("Not Eleigible for applying Driver licence");
			} else {
				System.out.println("Eleigible for applying Driver licence");
			}
		} else if (age > 100) {
			System.out.println("Not Eleigible for applying Driver licence");
		} else {
			System.out.println("Re-apply for Driving licence");
		}

	}

	// @Test
	public void switchCaseCondition() {
		switch (age) {
		case 17:
			System.out.println("Not Eleigible for applying Driver licence");
			break;
		case 18:
			System.out.println("Eleigible for applying Driver licence");
			break;
		case 19:
			System.out.println("Eleigible for applying Driver licence");
			break;
		default:
			System.out.println("Re-apply for Driving licence");
			break;
		}
	}

	// @Test
	public void switchCaseWithString() {
		switch (test) {
		case "smoke":
			System.out.println("Smoke Testing");
			break;
		case "sanity":
			System.out.println("sanity Testing");
			break;
		default:
			System.out.println("Regresion Testing");
		}
	}

	//@Test
	public void forLoop() {
		for (int i = 0; i <= 18; i++) {
			if (age == 19) {
				break;
			} 
			else {

				System.out.println("Test" + i++);
			}
		}
	}
	
	//@Test
	public void forEachLoop() {
		for (String i : arr) {
			System.out.println("Testing ======= "+ i);
		}
		
		for (int j : arr1) {
			System.out.println("Test ======" + j);
		}
	}
	
	@Test
	public void whileLoop() {
		int k = 0;
		while (k <= 10) {
			//System.out.println("Test");
			System.out.println("Test" + k++);
		}
	}
	
	@Test
	public void doWhileLoop() {
		int l = 10;
		
		do {
			
			System.out.println("Test" + l++);
		}while (l<=10);
	}

}

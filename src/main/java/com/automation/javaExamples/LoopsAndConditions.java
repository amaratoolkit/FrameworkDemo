package com.automation.javaExamples;

import org.testng.annotations.Test;

public class LoopsAndConditions {
	public int age=18;
	public String test = "smoke";
	int[] arr = {1,2,3,5,7};
	
	//@Test
	public void ifCondition() {
		if(age>18) {
			System.out.println("Eligible for driving licence");
			
		}else if(age<18) {
			System.out.println("Not Eligible for driving licence");
			 
		} else if(age == 18) {
			System.out.println("Apply for driving licence");
		}else {
			System.out.println("driving licence cancelled");
		}
	}
	
	//@Test
	public void switchCase() {
		switch(age) {
		case 17: 
			System.out.println("not Eligible for driving licence");
			break;
		case 18: 
			System.out.println("Apply for driving licence");
			break;
		case 70:
			System.out.println("Not Eligible for driving licence");
			break;
		default:
			System.out.println("Driving licence Cancelled");
		}
	}
	
	//@Test
	public void switchCaseString() {
		switch(test) {
		case "sanity": 
			System.out.println("Sanity testing");
			break;
		case "smoke": 
			System.out.println("Smoke testing");
			break;
		case "regression":
			System.out.println("regression testing");
			break;
		default:
			System.out.println("Adhoc testing");
		}
	}
	
	//@Test
	public void forLoop() {
		for(int i=1; i<age; i++) {
			System.out.println(i+1);
			if(i==10) {
				break;
			}
		}
	}
	
	@Test
	public void whileLoop() {
		while(age>=18) {
			System.out.println("While loop execution");
			age = age+1;
			System.out.println("age ===" + age);
			
			if(age>60) {
				break;
			}
		}
	}
	


}

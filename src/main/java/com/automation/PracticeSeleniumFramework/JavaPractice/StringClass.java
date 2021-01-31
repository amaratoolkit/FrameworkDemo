package com.automation.PracticeSeleniumFramework.JavaPractice;

public class StringClass {
	
	String s1 = "Kohli";
	String s2 = "Java";
	String s3 = new String("Java");
	String s4 = new String("Kohli");
	String s5 = "JAVA";
	
	public static void main(String[] args) {
		StringClass sc = new StringClass();
		
		System.out.println("compare s1 & s2 =====" + sc.s1.equals(sc.s2));
		
		System.out.println("compare s1 & s4 =====" + sc.s1.equals(sc.s4));
		
		System.out.println("compare s1 & s4 =====" + sc.s1 == sc.s4);
		
		System.out.println("concatnation s1 & s2 =====" + sc.s1.concat(sc.s2));
		
		System.out.println("concatnation s1 & s2 =====" + sc.s1 + sc.s2);
		
		System.out.println("Compare s2 & s5 =====" + sc.s2.equals(sc.s5));
		
		System.out.println("Compare s2 & s5 =====" + sc.s2.equalsIgnoreCase(sc.s5));
		
		
	}
	

}

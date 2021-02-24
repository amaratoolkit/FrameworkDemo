package com.automation.javaExamples;

public class StringClass {
	
	String s1 = "Siva";
	String s2 = new String("Siva");
	String s3 = new String("Siva");
	String s4 = "Siva";
	char ch[] = {'1','2','3'};
	
	public static void main(String args[]) {
		StringClass sc = new StringClass();
		System.out.println("s1 and s4 ===========" + sc.s1.equals(sc.s4));
		
		System.out.println("s2 and s3 ===========" + sc.s2.equals(sc.s3));
		
		System.out.println("s1 and s4 ===========" + sc.s1 == sc.s4);
		
		System.out.println("s2 and s3 ===========" + sc.s2 == sc.s3);
		
		System.out.println("s1 and s2 ===========" + sc.s1.equals(sc.s2));
		
		String ss = "Siva";
		String se = "Siva";
		
		System.out.println("SS and SE ========" + ss.equals(se));
		
	}
}

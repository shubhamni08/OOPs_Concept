package com.methodOverloading;

public class Test2 {

	public void m1(Object o) {
		System.out.println("Object version");
	}
	
	public void m1(String s) {
		System.out.println("String version");
	}
	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.m1(null);	//String version
		
		obj.m1(new Object());	//Object version
		
		obj.m1("Shubham");	//String version
		

	}

}

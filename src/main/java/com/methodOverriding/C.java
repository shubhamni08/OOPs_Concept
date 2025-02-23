package com.methodOverriding;

public class C extends P{
//  variable hiding - whether var is static/non static variable resolution is always takes care by 
//	compiler based on reference type
	String s = "Child";
	
	public void marry() {
		System.out.println("Shrestha");
	}
	
	public void m1() throws Exception, NullPointerException{
		System.out.println("Child method");
	}
	
	public String m2() {
		System.out.println("Child class String-Covarient return type");
		return null;
	}
	
	//both methods are static then it is not overriding it is method hiding
	//method hiding - method resolution always takes care by compiler based on ref type.
	public static void m3() {
		System.out.println("Child m3 method");
	}
	
	//args are different so it is method overloading not overriding.
	public void m4(int i) {
		System.out.println("Child m4 method");
	}
}

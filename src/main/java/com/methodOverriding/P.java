package com.methodOverriding;

public class P {
//  variable hiding - whether var is static/non static, variable resolution is always takes care by 
//	compiler based on reference type
	static String s = "Parent";

	public void marry() {
		System.out.println("Vaishnavi");
	}
	
	public void property() {
		System.out.println("Cash+Gold+Car");
	}
	
	public void m1() throws Throwable{
		System.out.println("Parent method");
	}
	
	public Object m2() {
		System.out.println("Parent class Object-Covarient return type");
		return null;
	}
	
	//both methods are static then it is not overriding it is method hiding
	//method hiding - method resolution always takes care by compiler based on ref type.
	public static void m3() {
		System.out.println("Parent m3 method");
	}
	
	//overriding wrt var-arg
	//args are different so it is method overloading not overriding.
	public void m4(int... i) {
		System.out.println("Parent m4 method");
	}
	
}

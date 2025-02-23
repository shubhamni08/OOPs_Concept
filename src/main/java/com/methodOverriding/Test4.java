package com.methodOverriding;

class P13{
	protected static String name = "SHubham";
	
	public static void m1() {				
		System.out.println("Parent class");
	}

}

class C13 extends P13{
	public String name = "Nikam";
	
	public static void m1() {					
		System.out.println("Child class");
	}
}
//if you are trying to override non-static method to static method or vice versa you will get Compiler time error.
//if both methods are static then it's not method overriding it's method hiding & in method hiding method resolution 
//is done by compiler based on reference type.

public class Test4 {

	public static void main(String[] args) {
		P13 obj1 = new P13();
		System.out.println(obj1.name);
		obj1.m1();
		
		System.out.println();
		P13 obj2 = new C13();
		System.out.println(obj2.name);
		obj2.m1();
		
		System.out.println();
		C13 obj3 = new C13();
		System.out.println(obj3.name);
		obj3.m1();
	}

}

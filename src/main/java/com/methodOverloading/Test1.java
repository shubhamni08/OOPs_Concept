package com.methodOverloading;
//byte->short->
//            int->long->float->double
//      char->
public class Test1 {

	public void m1(int a) {
		System.out.println("Int argument - "+a);
	}
	
	public void m1(float a) {
		System.out.println("Float argument");
	}
	
//	public void m1(double a) {
//		System.out.println("Double argument");
//	}
	
	public void m1(int a, float b) {
		System.out.println("Int-Float version");
	}
	
	public void m1(float a, int b) {
		System.out.println("Float-Int version");
	}
	
	public void m1(Object o) {
		System.out.println("Object version");
	}
	
	public void m1(String s) {
		System.out.println("String version");
	}
	
//	public void m1(StringBuilder s) {
//		System.out.println("String Builder version");
//	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1(10);
		t1.m1(10f);
		t1.m1('A');				//Auto promotion from char to int
		System.out.println("--");
		t1.m1(10.10);			//C.E
		System.out.println("--");

		t1.m1(10,10.1f);		//Int-Float version
		t1.m1(10f,10);			//Float-Int version
//		t1.m1(10,10);			//C.E Ambiguity
//		t1.m1(10.0f,10.0f);		//C.E 
		
		t1.m1(new Object());	//Object version
		t1.m1("Shubham");		//String version
		t1.m1(null);			//String version
	}

}

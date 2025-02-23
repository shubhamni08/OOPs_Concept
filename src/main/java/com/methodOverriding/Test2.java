package com.methodOverriding;

class P11{
	public Object m1() {	
		System.out.println("Object Type");
		return null;
	}
}

class C11 extends P11{
	public String m1() {
		System.out.println("String Type");
		return null;
	}
}

public class Test2 {

	public static void main(String[] args) {
		P11 obj1 = new P11();
		obj1.m1();			
		
		P11 obj2 = new C11();
		obj2.m1();			
		
		C11 obj3 = new C11();
		obj3.m1();		
		
//		co-varient return type - child class return type need to be same as parent class return type or it's child type is 
//		also allowed else we will get C.E

	}

}

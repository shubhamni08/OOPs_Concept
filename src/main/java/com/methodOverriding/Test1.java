package com.methodOverriding;

class Parent{
	public void marry() {
		System.out.println("Bhagyalaxmi");
	}
}

class Child extends Parent{
	public void marry() {
		System.out.println("Aishwarya");
	}
}

public class Test1 {

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.marry();			//Bhagyalaxmi
		
		Parent obj2 = new Child();
		obj2.marry();			//Aishwarya
		
		Child obj3 = new Child();
		obj3.marry();			//Aishwarya

	}

}

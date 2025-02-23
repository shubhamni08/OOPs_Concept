package com.methodOverloading;


class Animal{
	
}

class Monkey extends Animal{
	
}

public class Test {
	
	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	
	public void m1(Monkey m) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.m1(null);		//Monkey version
		
		Animal a1 = new Animal();
		obj.m1(a1);			//Animal version
		
		Monkey m1 = new Monkey();
		obj.m1(m1);			//Monkey version
		
		Animal a2 = new Monkey();
		obj.m1(a2);			//Animal version
		//method resolution is based on reference type and take care by compiler

	}

}

package com.oops;

abstract class Vehicle{
	
	public abstract int getNoOfWheels();
}

class Bus extends Vehicle{

	public int getNoOfWheels() { 
		return 6;
	}
}

class Auto extends Vehicle{

	public int getNoOfWheels() {
		return 3;
	}
}
public class AbstractMethodDesc {
	
	//if you don'y know about implementation we can declare method with abstract keyword modifier.
	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
		
		Auto a = new Auto();
		System.out.println(a.getNoOfWheels());
	}
}

package com.oops;

public class SingletonTestClass {
	
	private static SingletonTestClass s = null;
	
	private SingletonTestClass() {}
	
	//factory method
	public static SingletonTestClass getSingletonClass() {
		
		if(s==null) {
			s =  new SingletonTestClass();
		}
		
		return s;
	}

}

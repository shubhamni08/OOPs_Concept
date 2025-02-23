package com.oops;

public class Client {

	public static void main(String[] args) {
		SingletonTestClass s = SingletonTestClass.getSingletonClass();
		System.out.println(s.hashCode());
		
		SingletonTestClass s1 = SingletonTestClass.getSingletonClass();
		System.out.println(s1.hashCode());
		
		if(s==s1) {
			System.out.println("Single Object created");
		}
	}
	
}

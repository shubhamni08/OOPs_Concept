package com.constructor;

//parameterized constructor
public class Dog {

	 // Private instance variables
    private String name;
    private String color;
    
    //parameterized constructor
    Dog(String name, String color){
    	this.name = name;
    	this.color = color;
    }
    
    
	public String getName() {
		return name;
	}


	public String getColor() {
		return color;
	}

	public static void main(String[] args) {
		 // Create a new Dog object using the parameterized constructor
		Dog myDog = new Dog("Auro", "Golden");
		
		// Print the values of the instance variables
        System.out.println("Dog's Name: " + myDog.name);
        System.out.println("Dog's Color: " + myDog.color);
	}

}

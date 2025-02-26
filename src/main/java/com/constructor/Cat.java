package com.constructor;
//Default constructor
public class Cat {
	// Private instance variables
	private String name;
    private int age;
    
    // Default constructor
    Cat(){
    	this.name = "Unknown";
    	this.age = 0;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for age
    public int getAge() {
        return age;
    }
    
	public static void main(String[] args) {
		// Create a new Cat object using the default constructor
		Cat myCat = new Cat();
		
		System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());
		

	}

}

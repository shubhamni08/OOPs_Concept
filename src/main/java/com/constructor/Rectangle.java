package com.constructor;
//Copy constructor - Implement a parameterized constructor and a copy constructor that initializes a new object 
//using the values of an existing object. Print the values of the variables.
public class Rectangle {

	// Private instance variables
    private double length;
    private double width;
    
    //parameterized constructor
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	// Copy constructor
	public Rectangle(Rectangle rectangle) {
		this.length = rectangle.length;
		this.width = rectangle.width;
	}

	public static void main(String[] args) {
		// Create a new Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(12.5, 4.5);
        // Print the values of the instance variables for rect1
        System.out.println("Rectangle 1 Length: " + rect1.length);
        System.out.println("Rectangle 1 Width: " + rect1.width);
        
        System.out.println();
        
        // Create a new Rectangle object using the copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        // Print the values of the instance variables for rect1
        System.out.println("Rectangle 1 Length: " + rect2.length);
        System.out.println("Rectangle 1 Width: " + rect2.width);
	}

}

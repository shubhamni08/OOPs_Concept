package com.constructor;
//constructor chaining
public class Student {
	
	private int studentId;
	private String studentName;
	private String grade;
	
	public Student(){
		//constructor chaining is used by calling the parameterized constructor using this()
		this(0,"unknown","None");	// Call the parameterized constructor with default values
	}
	
	public Student(int studentId, String studentName, String grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}

	public static void main(String[] args) {
		// Create a new Student object using the default constructor
        Student student1 = new Student();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.studentId);
        System.out.println("Student1 Name: " + student1.studentName);
        System.out.println("Student1 Grade: " + student1.grade);
        
        System.out.println();
        // Create a new Student object using the parameterized constructor
        Student student2 = new Student(1, "Shubham", "A+");
        // Print the values of the instance variables for student2
        System.out.println("Student1 ID: " + student2.studentId);
        System.out.println("Student1 Name: " + student2.studentName);
        System.out.println("Student1 Grade: " + student2.grade);

	}

}

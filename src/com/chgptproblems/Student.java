package com.chgptproblems;
//Create a class:
//Student
//Requirements
//Instance variables:
//studentName
//rollNo
//marks
//Static variable:
//collegeName
//Methods:
//setData()
//display()
//Task
//Create 3 students and print:

public class Student {
	String student_name;         //Instance unique data 
	static String collegeName = "VIIT";    //Static shared data
	int Rollno;
    static int rollCounter = 100;     //Static shared data
//    {
//    	Roll_no++;
//    }
	int Marks;
	static 
		String college_name="VIIT";
	//	System.out.println(college_name);
	void setData(String name, int studentMarks) {
		student_name=name;
		Marks=studentMarks;
		rollCounter++;       // Increment the shared counter
        Rollno = rollCounter; // Assign the unique roll number to this specific student

//		System.out.println(college_name);
//		System.out.println(student_name);
//		System.out.println(Roll_no);
//		System.out.println(Marks);
		}
	void display() {
		System.out.println("College: " + college_name);
		System.out.println("Student Name: " + student_name);
		System.out.println("Roll Number: " + Rollno);
		System.out.println("Marks Secured:" + Marks);
		
	}
	

	public static void main(String[] args) {
		
//		Student s = new Student();
		Student s1 = new Student();
        s1.setData("Rakesh", 90); // One line to set
        s1.display();             // One line to print

        // Student 2
        Student s2 = new Student();
        s2.setData("Rajesh", 85);
        s2.display();

        // Student 3
        Student s3 = new Student();
        s3.setData("Vivek", 95);
        s3.display(); 
//		s.student_name="Rakesh";
//		s.Marks=90;
//		s.setData();

//		Student s1 = new Student();
//		s1.student_name="Rajesh";
//		s1.Marks=95;
//		s1.setData();

//		Student s2 = new Student();
//		s2.student_name="Vivek";
//		s2.Marks=96;
//		s2.setData();
		
		

		
	}

}

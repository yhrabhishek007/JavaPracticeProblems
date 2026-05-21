package com.practice;
//6. Hospital Patient Record
//Create a class Patient.
//patientName
//disease
//patientId
//Patient ID should generate automatically.

public class PatientRecord {
//	static int id;
//	Shared by all objects
//	Common counter
//	int patientId;
//	Separate for every object
//	Stores individual patient ID
	static int id;
	String name;
	String disease;
	{
		id=id+1;  //id+=1; id++;
//		i++ → best for loops/counters
//		i += 1 → good when adding values dynamically
//		i = i + 1 → basic beginner form
//		System.out.println(id);
	}
	
	void display() {
		System.out.println(name);
		System.out.println(disease);
		System.out.println(id);
	}

	public static void main(String[] args) {
		PatientRecord p = new PatientRecord();
//		p.id=001;
		p.name="niraj";
		p.disease="viral fever";
		p.display();
		
//		p.id=002;
		PatientRecord p1 = new PatientRecord();
		p1.name="diraj";
		p1.disease="tyfoid";
		p1.display();
		

		
	}

}

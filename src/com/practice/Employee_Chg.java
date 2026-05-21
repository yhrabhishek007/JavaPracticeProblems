package com.practice;

public class Employee_Chg {
//	4. Employee ID Generator
//	Create an Employee class.
//	employee name
//	salary
//	employeeId
//	Employee ID should auto-increment using static variable.
//	Example:
//	1001
//	1002
//	1003
//	Concepts:
//	static variable
//	instance block
//	shared data
	static int SrNo=1000;	
	 int employee_id;
	String Employee_name;
	int Salary;
	{SrNo+=1;
	employee_id=SrNo;
	}
	 
	void display() {
		System.out.println(employee_id);
		System.out.println(Employee_name);
		System.out.println(Salary);
//		System.out.println(employee_id);


	}
	
	public static void main(String[] args) {
		Employee_Chg e= new Employee_Chg();
//        e.display();
        e.Employee_name="raj";
        e.Salary=50000;
        e.display();
        
        Employee_Chg e1= new Employee_Chg();
//      e.display();
      e1.Employee_name="roy";
      e1.Salary=50600;
      e1.display();
      
      Employee_Chg e2= new Employee_Chg();
//    e.display();
    e2.Employee_name="ranjith";
    e2.Salary=60000;
    e2.display();
        
        

       
        
		
		
	}
}

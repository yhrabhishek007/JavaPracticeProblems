package com.practice;

public class Rough {

 Rough r=new Rough();    // if we put static then it will print the statement
	public static void main(String[] args) {
		
		Rough r=new Rough();
		r.main();       //Stackoverflow 

	}
	void main() {
		System.out.println("instance block");
	}

}

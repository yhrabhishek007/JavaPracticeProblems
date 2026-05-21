package com.practice;
//Create a class MovieTicket.
//customerName
//seatNumber
//price
//Seat number should auto-increment automatically.
public class Practice2 {
	
//	seat_no=001;
//	static int seat_no=001;
	static int seat_no=17;
//	int seat;
	String c_name;
	int price;
	{
		seat_no+=1;
//		seat=seat_no;
	}
	void display() {
		System.out.println(c_name);
		System.out.println(seat_no);
		System.out.println(price);

	}
 
	
	public static void main(String[] args) {

		Practice2 t = new Practice2();
		t.c_name="Bhanu Prasad";
		t.price=150;
		t.display();
		
		Practice2 t2 = new Practice2();
		t2.c_name="Hari Deepak";
		t2.price=150;
		t2.display();
		
		Practice2 t3 = new Practice2();
		t3.c_name="Shiv Neeraj";
		t3.price=150;
		t3.display();
	}

}

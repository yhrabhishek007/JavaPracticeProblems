package com.practice;

public class Bank2 {

	String Name;
	int balance;
//	int amount=75000;
	    void deposit(int amount) {
		balance+=amount;
		System.out.println(amount + " deposited");
		
	}
	    void withdraw(int amount) {
		if (amount<=balance) {
			balance-=amount;
			System.out.println(amount + " withdrawn");
		}
	
		else {
			System.out.println("Insufficient Balance");
		}
		}
		
	    void checkbalance() {
	    	System.out.println("Current Balance: "+balance);
			
		}

	public static void main(String[] args) {
		Bank2 b = new Bank2();
		b.Name="deva";
		b.balance=50000;
		b.deposit(6473);
		b.withdraw(644473);
		b.checkbalance();
		


		

		
	}

}

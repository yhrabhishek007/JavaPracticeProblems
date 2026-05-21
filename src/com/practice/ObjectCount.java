package com.practice;

public class ObjectCount {
 static int count=0;
 {
	 count++;
	 System.out.println("No.of count for objects "+count);
 }
	public static void main(String[] args) {
		ObjectCount o = new ObjectCount();
		ObjectCount o1 = new ObjectCount();
		ObjectCount o2= new ObjectCount();
		ObjectCount o3 = new ObjectCount();
		ObjectCount o4 = new ObjectCount();
		
	}

}

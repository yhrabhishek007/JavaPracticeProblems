package com.practice;

public class Product {
	 String store_name;   //if we give in instance block then we must create object for every data like in store name
	 {
		store_name="H&M";
//		System.out.println("Store Name: " +store_name);
	}
	int product_id;
	String Product_name;
	int Product_price;
	void details() {
		System.out.println("Store Name: " +store_name);   
		System.out.println("Product ID: " +product_id);
		System.out.println("Product Name: " +Product_name);
		System.out.println("Product Price: " +Product_price);
		
	}
	

	
	public static void main(String[] args) {
		Product p = new Product();
		p.product_id=01;
		p.Product_name="jeans";
		p.Product_price=1999;
		p.details();
		
		Product p1 = new Product();
		p1.product_id=02;
		p1.Product_name="shirts";
		p1.Product_price=1599;
		p1.details();
		
		Product p2 = new Product();
		p2.product_id=03;
		p2.Product_name="trousers";
		p2.Product_price=1599;
		p2.details();

		
	}

}

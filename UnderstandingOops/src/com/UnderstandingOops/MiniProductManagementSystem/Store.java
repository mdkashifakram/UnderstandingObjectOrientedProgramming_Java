package com.UnderstandingOops.MiniProductManagementSystem;

import java.util.Scanner;

public class Store {
	private Product[] products;
	private int prodCount;
	
	

	public Store(int capacity) {
		products=new Product[capacity];
		prodCount=0;
	}


	public void addProduct(Product product) {
		if(prodCount<products.length) {
			products[prodCount++]=product;
		}
		else {
			System.out.println("Inventory Full!");
		}
	}
	public Product findProductbyName(String prod_search)
	{
		for(int i=0;i<prodCount;i++) {
			if(products[i].getProductName().equalsIgnoreCase(prod_search)) {
				return products[i];
			}
		}
	return null;
	}
		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Store store=new Store(5);
		Product p1=new Product(101,"MOBILE",12499);
		Product p2=new Product(102,"TV",42999);
		Product p3=new Product(103,"AC",52222);
		Product p4=new Product(104,"OVEN",22500);
		Product p5=new Product(105,"REFRIDGERATOR",62900);
		store.addProduct(p1);
		store.addProduct(p2);
		store.addProduct(p3);
		store.addProduct(p4);
		store.addProduct(p5);
		System.out.println("Enter a product to search : ");
		String prod_search=sc.nextLine();
		Product foundProduct=store.findProductbyName(prod_search);
		if(foundProduct!=null) {
			System.out.println("Found: "+foundProduct);
		}
		else {
			System.out.println("Product not found!");
		}
		
		
	}

}

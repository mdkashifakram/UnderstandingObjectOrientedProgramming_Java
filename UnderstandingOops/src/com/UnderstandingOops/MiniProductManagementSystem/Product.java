package com.UnderstandingOops.MiniProductManagementSystem;

public class Product {
	private int productid;
	private String productName;
	private double productPrice;
	
	public Product(int productid, String productName, double productPrice) {
		this.productid = productid;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductid() {
		return productid;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}
	
	
	

}

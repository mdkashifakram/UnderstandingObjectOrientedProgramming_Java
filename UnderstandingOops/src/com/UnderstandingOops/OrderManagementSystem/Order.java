package com.UnderstandingOops.OrderManagementSystem;

public class Order {
	private int orderId;
	private String product;
	private int quantity;
	private double pricePerUnit;

	public Order(int orderId, String product, int quantity, double pricePerUnit) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}


	public double calculateTotalPrice(){
		return quantity*pricePerUnit;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + ", quantity=" + quantity + ", pricePerUnit="
				+ pricePerUnit + "]";
	}

}

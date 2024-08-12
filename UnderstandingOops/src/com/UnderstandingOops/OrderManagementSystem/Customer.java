package com.UnderstandingOops.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;

	
	
	public Customer(String name) {
		this.name = name;
		this.orders = new ArrayList<>();
	}
	
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	
	public double calculateTotalAmountSpent(){
		return orders.stream()
					 .mapToDouble(Order::calculateTotalPrice)
					 .sum();
	}
	
	public void displayOrders(){
		for(Order order:orders) {
			System.out.println(order);
		}
	}
	
	
	public static void main(String[] args) {
		Customer customer=new Customer("Kashif Akram");
		customer.addOrder(new Order(1,"Laptop",2,90000.00));
		customer.addOrder(new Order(2,"Mobile",3,20000.00));
		customer.addOrder(new Order(3,"Headphone",7,5000.00));
		customer.addOrder(new Order(4,"TV",1,1190499.00));

		System.out.println("Orders from "+customer.name+" : ");
		customer.displayOrders();
		
		System.out.println("Total Amount Spent by "+customer.name+" is :"+customer.calculateTotalAmountSpent());
	}

}

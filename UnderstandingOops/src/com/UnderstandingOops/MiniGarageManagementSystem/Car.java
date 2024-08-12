package com.UnderstandingOops.MiniGarageManagementSystem;

public class Car {
	private String company;
	private String model;
	private double price;
	public Car(String company, String model, double price) {
		super();
		this.company = company;
		this.model = model;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
    public String toString() {
        return "Car [Company=" + company + ", Model=" + model + ", Price=" + price + "]";
    }
}

package com.UnderstandingOops.RectangleOperation;

public class Rectangle {
	private double length;
	private double breadth;
	
	
	
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public double calculateArea() {
		return length*breadth;
	}
	public double calculatePerimeter() {
		return 2*(length+breadth);
	}
	public static void main(String[] args) {
		
		Rectangle reactangle1=new Rectangle(20,50);
		Rectangle reactangle2=new Rectangle(120,150);
		
		System.out.println("Reactablge 1 : Area "+reactangle1.calculateArea());
		System.out.println("Reactablge 2 : Area "+reactangle2.calculateArea());
		// TODO Auto-generated method stub
		System.out.println("Reactablge 1 : Perimeter "+reactangle1.calculatePerimeter());
		System.out.println("Reactablge 2 : Perimeter "+reactangle2.calculatePerimeter());

	}

}

package com.UnderstandingOops.MiniGarageManagementSystem;

import java.util.ArrayList;
import java.util.List;


 
//version 1
public class Garage {
	private List<Car> cars;

	public Garage() {
		cars = new ArrayList<>();
	}
	public void addCar(Car car) {
		
	}
	public boolean removeCar(Car car) {
		return cars.remove(car);
	}

	public Car findMostExpensiveCar() {
		if(cars.isEmpty()) {
			return null;
		}
		Car mostExpensiveCar=cars.get(0);
		for(Car car: cars) {
			if(car.getPrice()>mostExpensiveCar.getPrice()) {
				mostExpensiveCar=car;
			}
		}
		return mostExpensiveCar;

	}
	public static void main(String[] args) {
		Garage garage=new Garage();
		Car car1=new Car("Suzuki","Swift Dzire",780000);
		Car car2=new Car("Mahindra","Thar",1780000);
		Car car3=new Car("Suzuki","Vitara",100000);

		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		
		Car mostExpensiveCar=garage.findMostExpensiveCar();
		if(mostExpensiveCar!=null) {
			System.out.println("Most Expensive car: "+mostExpensiveCar);
		}
		else {
			System.out.println("No car in the garage!");
		}
		garage.removeCar(car2);
			mostExpensiveCar=garage.findMostExpensiveCar();
			if(mostExpensiveCar!=null) {
				System.out.println("Most expensive car after remove: "+mostExpensiveCar);
		}
			else {
				System.out.println("No cars in the garage");
			}
	}

}

/*
//version 2
package com.UnderstandingOops.MiniGarageManagementSystem;

import java.util.ArrayList;
import java.util.List;


public class Garage {
	private List<Car> cars;

	public Garage() {
		this.cars = new ArrayList<>();
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	public Car mostExpensiveCar() {
		return cars.stream()
					.max((car1,car2)->Double.compare(car1.getPrice(), car2.getPrice()))
					.orElse(null);
	}
	
	public boolean removeCar(Car car) {
		return cars.remove(car);
		
	}
	public static void main(String[] args) {
		Garage garage = new Garage();
		Car car1 = new Car("SUZUKI", "VITARA", 120000);
		Car car2 = new Car("SUZUKI", "ABCD", 20000);
		Car car3 = new Car("SUZUKI", "EDRFT", 720000);
		Car car4 = new Car("SUZUKI", "ROYAL", 620000);

		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		garage.addCar(car4);

		

		System.out.println("Most expensive car : "+garage.mostExpensiveCar());
		garage.removeCar(car3);
		System.out.println("Most expensive car : "+garage.mostExpensiveCar());
		
	}
	
}

*/
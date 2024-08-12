package com.UnderstandingOops.SimpleInventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Item> items;

	public Inventory() {
		this.items = new ArrayList<>();
	}
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void displayInventory() {
		for(Item item:items) {
			System.out.println(item);
		}
	}
	
	public boolean isInStock(int itemId) {
		return items.stream()
					.filter(item->item.getItemId()==itemId)
					.anyMatch(item->item.getQuantity()>0);
	}
	
	public void removeItem(int itemId) {
		items.removeIf(item->item.getItemId()==itemId);
	}
	
//	check()--optional
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addItem(new Item(1,"Laptop",7));
		inventory.addItem(new Item(2,"Mobile",4));
		inventory.addItem(new Item(3,"Fan",3));
		inventory.addItem(new Item(4,"Coke",2));
		inventory.addItem(new Item(5,"Car",5));
		
		System.out.println("Inventory BEFORE operation: ");
		inventory.displayInventory();
		System.out.println("Is laptop in stock ? "+inventory.isInStock(1));
		System.out.println("Is Mobile in stock ? "+inventory.isInStock(3));
		inventory.removeItem(2);
		
		System.out.println("Inventory AFTER remove operation: ");
		inventory.displayInventory();
	}
	
	

}

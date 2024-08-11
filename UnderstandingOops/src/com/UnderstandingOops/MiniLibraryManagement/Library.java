package com.UnderstandingOops.MiniLibraryManagement;

public class Library {
	private Book[] books;
	private int bookCount;
	
	public Library(int capacity) {
		books=new Book[capacity];
		bookCount=0;
	}
	
	public void addBook(Book book) {
		if(bookCount<books.length) {
			books[bookCount++]=book;
		}
		else {
			System.out.println("Library is full!");
		}
	}
	public Double getTotalPrice() {
		double totalprice=0;
		for(int i=0;i<bookCount;i++) {
			totalprice+=books[i].getPrice();
		}
		return totalprice;
	}
	
	public void ListAllTitles() {
		for(int i=0;i<bookCount;i++) {
			System.out.println(books[i].getTitle());
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Library library=new Library(5);
		Book book1=new Book("A Diary of a CEO","Steven Bartlett",250);
		Book book2=new Book("The KiteRunnner","Khalid Hossaini",150);

		library.addBook(book1);
		library.addBook(book2);
		
		System.out.println("The total price of the books: "+library.getTotalPrice());
		
		
		System.out.println("Displaying all the book names in the library");
		library.ListAllTitles();
		
	}






}

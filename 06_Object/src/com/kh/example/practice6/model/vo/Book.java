package com.kh.example.practice6.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 
	// 1. 초기화 블럭
	// 2. setter
	// 3. 생성자 방식 초기화 => 주로 사용됨.
	// 4. jvm 초기화(기본)
	// 5.
	
	public Book(){	
	}
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		}
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println(title+","+publisher+", "+author+", "+price+", "+discountRate);
		
	}
}

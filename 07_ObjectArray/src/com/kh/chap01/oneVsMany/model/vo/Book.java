package com.kh.chap01.oneVsMany.model.vo;

public class Book {

	//도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price, String publisher) {

	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	
	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 모든 필드정보를 하나의 문자열로 합쳐 반환시켜주는 메서드
	public String information() {
		return title+", "+author+", "+price+", "+publisher;
	}
	
	
}








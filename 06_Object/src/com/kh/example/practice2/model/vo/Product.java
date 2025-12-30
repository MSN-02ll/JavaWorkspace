package com.kh.example.practice2.model.vo;

public class Product {
	// - = private 
	private String pName;
	private int price;
	private String brand;
	
	// 기본생성자
	// + = public
	public Product() {
		// 생성자는 반환형이 없음, 클래스와 동일한 기능 가지고 있음
		
	}
	
	public void information() {
		System.out.println(pName+" "+price+" "+brand+" ");
	}

}

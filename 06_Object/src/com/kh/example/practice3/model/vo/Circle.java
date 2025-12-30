package com.kh.example.practice3.model.vo;

public class Circle {
	// 대문자는 Final
	// 기울임 글꼴 => static but 이 문제에선 밑줄
	private static double PI =3.14;
	private static int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		System.out.println("넓이: "+((radius+1)*(radius+1)*PI)+" "+"둘레: "+((radius+1)*2*PI)); 
	}
	
	public void getAreaOfCircle() {
		System.out.println("넓이: "+radius*radius*PI+" ");
	}
	
	public void getSizeOfCircle() {
		System.out.println("둘레: "+2*radius*PI+" ");
	}
}

package com.kh.chap01_math.run;

public class MathRun {

	//자바lang 안에 있는 클래쓰는 별도의 호명없이 사용가능
	//import java.lang.Math;
	//java.lang패키지는 보이진 않지만 항상 import가 되어 있다.
	
	public static void main(String[] args) {
		//Math클래스의 유용한 매서드들
		//파이 (PI)
		System.out.println("파이 : "+Math.PI);
		
		//올림처리 메서드
		//올림 => Math.ceil(double) : double
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1));
		
		// 반올림 => Math.round(double) : long
		System.out.println("반올림 : "+Math.round(num1));
		
		// 버림 => math.floor(double) : double
		System.out.println("버림 : "+Math.floor(num1));
		
		// 절대값 => 음수도 양수, 양수는 양수로 만드는 메서드
		// Math.abs(in/double/long/float) : 입력한 자료형에 맞춰서
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));
		
		// 최소값
		// Math.min(int, int) : int
		System.out.println("최소값 : "+Math.min(5, 10));
		
		// 최대값
		// Math.max(int, int)
		System.out.println("최대값 : "+Math.max(5, 10));
		
		// 제곱근(루트)
		// Math.sqrt(double) : double
		System.out.println("4의 제곱근 :"+Math.sqrt(4.0));
		
		// 제곱
		// Math.pow(double, double) : double
		System.out.println("2의 10제곱 "+Math.pow(2,  10));
	}
}

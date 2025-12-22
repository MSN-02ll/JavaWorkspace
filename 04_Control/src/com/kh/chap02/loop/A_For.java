package com.kh.chap02.loop;

public class A_For {

	public void method3() {
		//1과 10사이의 정수 중 "홀수"만 출력하는 반복문을 만드시오.
		// 출력결과 : 1 3 5 7 9
		// 초기식 : int =1;
		
		//i+=2
		for(int i = 1; i <10; i++) {
			if(i % 2 ==1) System.out.print(i+" ");
		}
	
		for(int i = 1; i<10; i+=2) {
			System.out.print(i+" ");
		}
		
		public void method4() {
			// 1 - 10까지의 총 합계
			int sum = 0;
			sum += 1;
			for(int i = 1; i<= 10; i++) {
				sum += i;
			}
			System.out.println("1부터 10까지의 총 합: "+sum);
		}
		
		public void method5() {
			// 1에서부터 매번 달라지는 "랜덤값"까지의 총 합계
			/*
			 * java.lang.Math클래스의 random()를 호출하면,
			 * 매번 다른 "실수형"의 랜덤값을 얻어올 수 있다.
			 * 랜덤값의 범위
			 * 0.0 <= 랜덤값 , 1.0
			 * 
			 * 만약 1과 10사이의 랜덤값을 구하고 싶다면?
			 * 
			 * 1. 우선 10을 곱하기
			 * 0.0 <= 랜덤값 < 10.0
			 * 
			 * 2. 1 더하기;
			 * 1.0 <=랜덤값 < 11.0
			 * 
			 * 3.소수점 버리기
			 * 1<= 랜덤값 <= 10
			 * 10 => 출력하고자 하는 갯수
			 * 1=> 시작 숫자
			 * Math.random() * 출력할 갯수 + 시작수
			 * 
			 */
			int random = (int)(Math.random() * 10 + 1);
			System.out.println("랜덤값 : "+random);
			
			int sum = 0;
					for(int i=1; i<+ random; i++) {
						sum += i;
					}
					System.out.println("sum : " +sum);
			}
		public void method6() {
			//문자열의 문자를 반복
			String str = "hello"; // 문자열의 길이 5
			
			//System.out.print(str.charAt(0));
			// i 0,1,2,3,4
			// 문자열의 길이. length()
			for(int i = 0; i<str.length(); i++) {
				System.out.println(str.charAt(i));
			}
		}
		
		public void method7()
			// 중첩 반복문
			// 구구단 출력
			// 2 x 1 = 2
			// 2 x 2 = 4
			//  ...
			// 2 x 9 = 18
	}
}

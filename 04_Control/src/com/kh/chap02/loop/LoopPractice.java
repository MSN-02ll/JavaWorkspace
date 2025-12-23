package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		// 1 부터 입력값까지 한번이 출력
		// like 1 2 3 4 5 6 7 8// ex) 8
		while(true) {
		System.out.print("1 이상의 숫자를 입력해하시오 : ");
		int num = sc.nextInt();
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			continue;}
		int i=1;
			while(i<=num)System.out.print(i+++" ");
			break;
		}
	}
	public void practice2() {
		while(true) {
		System.out.print("1 이상의 숫자를 입력해하시오 : ");
		int num = sc.nextInt();
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			continue;}
		int i=1;
			while(i<=num)System.out.print(num--+" ");
			break;
			}
//		for(int i = num; i<num; i--) {
//			System.out.print(i+" ");
//		}
//		
//		if(num<1) {
//			System.out.println("1 이상의 숫자를 입력해 주세요.");
//			practice2();
//		}
	}
	
	public void practice3() {
		
//		System.out.print("정수 하나 입력: ");
//		int num = sc.nextInt();
//		
//		int sum = 0;
//		for(int i = 1; i<num; i++) {
//			sum +=i;
//			System.out.print(i+ i != num ? "+" : "="));	
//		}
//		System.out.println(sum);
		
		System.out.print("정수를 하나 입력하시오 : ");
		int num = sc.nextInt();
		int i=1;
		int sum=0;
		while(num>=i && num>0) {
			System.out.print(i+" "+"+"+" ");
			sum += i++;
		}
		while(num<=i && num<=0) {
			System.out.print(i+" "+"+"+" ");
			sum += i--;
		}
		System.out.println("="+" "+sum);
	}
	public void practice4() {
		
//		System.out.print("첫번째 숫자 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 숫자 : ");
//		int num2 = sc.nextInt();
//		
//		if(!(num1>0 && num2>0)) {
//			System.out.println("1 이상의 수를 입력해주세요.");
//			practice4();
//			return;
//		}
//		
//		int min = num1 > num2 ? num2 : num1;
//		int max = num1 > num2 ? num1 : num2;
//		
//		for(int i = min; i <= max; i++) {
//			System.out.print(i+" ");
//		}	
			
		while(true) {
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		if(num1<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			continue;}
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			continue;}
		
			while(num1<num2)System.out.print(num1+++" ");
				while(num1>num2)System.out.print(num2+++" ");
				if(num1==num2)System.out.println(num1);
				break;
		}
	}
	public void practice5() {
		while(true) {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
	
		if(num>9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			continue;
		}
		
		for(int dan = num; dan<=9; dan++) {
			System.out.println("===== "+dan+"단 =====");
			for(int i = 1; i<=9; i++) {
				System.out.println(dan+" X "+i+" = "+(dan * i));
			}
		}
		break;
		}
	}
	public void practice6() {
		//횟수 정해져있으면 for 반복문이 좋다.
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		//10회 반복하라
		for(int i=0; i<10; i++) {
			System.out.println(num+" ");
			num += gong;
		}
	}
	
	public void practice7() {
	

	System.out.print("연산자(+, -, *, /, %) : ");
	String cl = sc.next();
	
	if(cl.equals("exit")){
		System.out.println("프로그램을 종료합니다.");
		return;
	}
	System.out.print("정수1: ");
	int num1 = sc.nextInt();
	
	System.out.print("정수2: ");
	int num2 = sc.nextInt();
	
	if(!cl.equals("+")&&!cl.equals("-")&&!cl.equals("*")
			&&!cl.equals("/")&&!cl.equals("%")) {
		System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		practice7();
		return;
	}
	if(cl.equals("/") && num2==0) {
		System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
		practice7();
		return;
	}
	switch(cl) {
	case "+":
		System.out.println(num1+" "+"+"+" "+num2+" "+"="+(num1+num2));
		break;
	case "-":
		System.out.println(num1+" "+"-"+" "+num2+" "+"="+(num1-num2));
		break;
	case "*":
		System.out.println(num1+" "+"*"+" "+num2+" "+"="+(num1*num2));
		break;
	case "/":
		System.out.println(num1+" "+"/"+" "+num2+" "+"="+(num1/num2));
		break;
	case "%":
		System.out.println(num1+" "+"%"+" "+num2+" "+"="+(num1%num2));
		break;
	}
	} 
	
	public void practice8() {
		
	}
}

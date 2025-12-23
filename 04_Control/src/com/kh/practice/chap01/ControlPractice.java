package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);
			
	public void practice1() {
	}
	public void practice2() {
	}
	public void practice3() {
	}
	public void practice4() {
	}
	public void practice5() {
	}
	public void practice6() {
		// 관리자, 회원, 비회원
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		String grade = sc.next();
		
		switch(grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리" );
		case "회원":
			System.out.println("게시글 작성, 댓글 작성");
		case "비회원":
			System.out.println("게시글 조회");
		}
	}
//		if (name.equals("관리자")) {
//			System.out.println("회원관리");
//			System.out.println("게시글 관리");
//			System.out.println("게시글 작성");
//			System.out.println("게시글 조회");
//			System.out.println("댓글 작성");
//			
//		}else if (name.equals("회원")){
//			System.out.println("게시글 작성");
//			System.out.println("게시글 조회");
//			System.out.println("댓글 작성");
//			
//		}else if (name.equals("비회원")){
//			System.out.println("게시글 조회");
//			return;
//		}else;
//	}
	public void practice7() {
		System.out.print("키(m) : ");
		double height = sc.nextDouble();
		
		System.out.println("kg : ");
		double kg = sc.nextDouble();
		
		double BMI = kg / (height * height);
		
		System.out.println("당신의 BMI : "+BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI < 23){
			System.out.println("정상체중");
		}else if(BMI <30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
	public void practice8() {
		
		System.out.print("피연산자 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		char ch = sc.next().charAt(0);
		
		if(num1 >0 && num2 >0 &&
			(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%')
			){
		System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");		
		return;
		
		switch(ch){
			case '+':
				System.out.println(num1 + ch + num2+" = "+ (num1 + num2));
				break;
			case '-':
				System.out.println(num1 + ch + num2+" = "+ (num1 - num2));
				break;
			case '*':
				System.out.println(num1 + ch + num2+" = "+ (num1 * num2));
				break;
			case '/':
				System.out.println(num1 + ch + num2+" = "+ (num1 / (double)num2));
				break;
			case '%':
				System.out.println(num1 + ch + num2+" = "+ (num1 % num2));
				break;
		}
	}
	}
	public void practice9() {
		System.out.print("중간고사 점수 : ");
		int mt = sc.nextInt();
		
		System.out.print("기말고사 점수 : ");
		int ft = sc.nextInt();
		
		System.out.print("과제 점수: ");
		int report = sc.nextInt();
		
		System.out.print("출석 점수: ");
		int attend = sc.nextInt();
		
		double total = mt * 0.2 +ft * 0.3 + report *0.3 + attend;
		
		if(attend <= 14) {
			System.out.println("Fail [출석횟수 부족 ("+attend+"/20)]");
			return;
		}
		
		System.out.println("총점 : "+total);
		if(total < 70) {
			System.out.println("Fail");
		}else {
			System.out.println("PASS");
		}
		
	}
	public void practice10() {
		
		System.out.println("선택 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
			break;
		case 8 :
			practice8();
			break;
		case 9 :
			practice9();
			break;
		}
	}
	public void practice11() {
		System.out.print("비밀번호를 입력하시오 : (1000~9999) :");
		int pwd = sc.nextInt();
		
		if( !(pwd>= 1000 && pwd<= 9999)) {
			System.out.println("자리 수 맞지 않음");
			return;
		}
		
		int ft = pwd / 1000; // 1234/1000 = 1(.234)=> chartAt(0)
		int sc = pwd / 100 % 10; // 1234 / 100 => 12(.34) % 10 => 2
		int td = pwd / 10 % 10; // 1234 / 10 => 123 % 10 => chartAt(2)
		int fth = pwd % 10; // 1234 % 10 => 4
		
		if(ft == sc || ft == td || ft == fth
			|| sc == td || sc == fth || td == fth) {
			System.out.println("중복값 있음");
		}else {
			System.out.println("생성 성공");
		}
			
	}
}

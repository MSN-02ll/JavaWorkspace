package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		// 메인 메뉴 출력
		// 1. 지정 문자열 ➔ tokenMenu()
		// 2. 입력 문자열 ➔ inputMenu()
		// 3. 프로그램 끝내기 ➔ “프로그램을 종료합니다” 
		//    출력 후 종료
		// 잘못 입력했을 시 “잘못 입력하셨습니다. 
		// 다시 입력해주세요.” 출력 후 반복
		while(true) {
		System.out.println("1. 지정 문자열\r\n"
						+ "2. 입력 문자열\r\n"
						+ "3. 프로그램을 종료합니다.");
		System.out.print("입력 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				return;
				
		
			}
		
		}
	}
	
	public void tokenMenu() {
		// 토큰 처리 전, 토큰 처리 후 출력
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		String str = new String ("J a v a P r o g r a m ");
		System.out.println("토큰 처리 전 글자 : "+ str 
						+"\r\n토큰 처리 전 개수 : "+str.length());
		
		str = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : "+ str 
						+"\r\n토큰 처리 후 개수 : "+str.length()
						+"\r\n대문자로 출력 : "+str.toUpperCase());
			
		}
		
	
	public void inputMenu() {
		// 첫 글자 대문자와 찾을 문자 몇 개 있는지 출력
		// 문자열을 입력하세요 :
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		// 찾을 문자를 하나 입력하세요 :
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		// 반환 값 출력
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		System.out.println(tc.firstCap(str));
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char ch = sc.next().charAt(0);
		System.out.println(tc.findChar(str, ch));
	
	}
	
}

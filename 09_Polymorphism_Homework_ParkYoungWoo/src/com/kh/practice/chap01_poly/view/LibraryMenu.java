package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;

public class LibraryMenu {

	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
	// 메인 메뉴 출력 메소드	
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				myInfo();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				continue;
			}
			
		}
	}
	public void selectAll() {
	// 도서 전체 목록 출력 메소드
	}
	public void searchBook() {
	// 검색할 제목 키워드를 입력 받아 검색
	//	결과를 출력하는 메소드
	}
	public void rentBook() {
	// 대여할 도서 인덱스를 입력 받아 
    // LibraryController의 rent Book 메소드로 전달
	// => 결과 값을 result로 받아 
	//	result가 0일 경우, 1일 경우, 2일 경우 각각에 해당하는 출력문 출력
	}
	
}

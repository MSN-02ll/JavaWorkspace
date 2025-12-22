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
		
		String name = sc.next();
		
//		switch(name) {
//		case "관리자":
//			System.out.println("회원관리");
//			System.out.println("게시글 관리");
//			System.out.println("게시글 작성");
//			System.out.println("게시글 조회");
//			System.out.println("댓글 작성");
//			break;
//		case "회원":
//			System.out.println("게시글 작성");
//			System.out.println("게시글 조회");
//			System.out.println("댓글 작성");
//			break;
//		case "비회원":
//			System.out.println("게시글 조회");
//			return;
//		default: ;
			
//			
//		}
		if (name.equals("관리자")) {
			System.out.println("회원관리");
			System.out.println("게시글 관리");
			System.out.println("게시글 작성");
			System.out.println("게시글 조회");
			System.out.println("댓글 작성");
			
		}else if (name.equals("회원")){
			System.out.println("게시글 작성");
			System.out.println("게시글 조회");
			System.out.println("댓글 작성");
			
		}else if (name.equals("비회원")){
			System.out.println("게시글 조회");
			return;
		}else;
	}
	public void practice7() {
	}
	public void practice8() {
	}
	public void practice9() {
	}
	public void practice10() {
	}
	public void practice11() {
	}
}

package com.kh.practice.chap01_poly.controller;



public class LibraryController {

	public void insertMember(Member mem) {
		//전달 받은 mem 주소값을 통해
		//LibraryController의 mem에 대입
	}
	
	public Member myInfo() {
		// 회원 레퍼런스(mem) 주소값 리턴
		return null;
	}
	
	public Book[] selecAll() {
		// 도서 전체 목록 (bList) 주소값 리턴
		return null;
	}
	
	public Book[] searchBook(String keyword) {
		// 전달 받은 키워드가 포함된 도서가 여러 개가
		// 존재할 수 있으니 검색된 도서를 담아줄
		// Book 객체 배열을 새로이 생성하고
		// for문을 통해 bList 안의 도서들과 전달받은 키워드를
		// 비교하여 포함하고 있는 경우 새로운 배열에 차곡차곡 담기
		// => 그 배열 주소 값 리턴
		return null;
	}
	
	public int rentBook(int index) {
		
		return;
	}
}

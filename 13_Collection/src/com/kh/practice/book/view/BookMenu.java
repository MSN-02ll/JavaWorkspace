package com.kh.practice.book.view;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.model.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	// 필드
	Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	
	public BookMenu(){
	// 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
	// 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입
		
		bc.makeFile();
		bArr = bc.fileRead();
	}
	public void mainMenu(){
	System.out.print("1. 도서 추가 저장" 
					+"\n2. 저장 도서 출력" 
					+"\n9. 프로그램 끝내기" 
					+"\n메뉴 번호 :");
	int menu = sc.nextInt(); 
	
		switch(menu) {
		case 1 :
			fileSave();
		case 2 :
			fileRead();
		case 9 :
			System.out.println("프로그램 종료.");
			return;
		default : 
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
	public void fileSave() {
		System.out.print("도서 명 : ");
			String title = sc.next();
		System.out.print("저자 명 : ");
			String author = sc.next();
		System.out.print("도서 가격 : ");
			int price = sc.nextInt();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
			String date = sc.next();
//			LocalDate.parse(input);
			
			String[]arr = date.split("-");
			Calendar cal = Calendar.getInstance();
			cal.set(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
			
			
//			String[]parts = date.split("-");
//				int year = Integer.parseInt(parts[0]);
//				int month = Integer.parseInt(parts[1]);
//				int day = Integer.parseInt(parts[2]);
//			
//			Calendar pubD = Calendar.getInstance();
//				pubD.set(Calendar.YEAR, year);
//				pubD.set(Calendar.MONTH, month -1);
//				pubD.set(Calendar.DATE, day);
//			
			
			
			
		System.out.print("할인율 : ");
			double discount = sc.nextDouble();
			
			Book b = new Book();
		
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
		
			for(int i=0; i<bArr.length; i++) {
			
				if(bArr[i] == null) {
				bArr[i] = b;
				break;
				}
			}
			bc.fileSave(bArr);
			
			
	
	}
	public void fileRead(){
	// bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
		
		Book[] bArr = bc.fileRead();
		
		for(Book b : bArr) {
			if(b !=null) {
				System.out.println(b);
			}
		}
		
	}
	
	
}

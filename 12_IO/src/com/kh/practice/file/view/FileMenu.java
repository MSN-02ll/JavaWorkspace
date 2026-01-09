package com.kh.practice.file.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	FileOutputStream fout = null;
	StringBuilder sb = null;
	String result = null;
	boolean isFileExist = true;
	//메인 메뉴 출력
	public void mainMenu() {
		while(true) {
		System.out.println("***** My Note *****"
				+ "\r\n1. 노트 새로 만들기" 
				+ "\r\n2. 노트 열기" 
				+ "\r\n3. 노트 열어서 수정하기" 
				+ "\r\n9. 끝내기");
		
		System.out.print("\r\n메뉴 번호 : ");
			int menu = sc.nextInt();
			
				switch(menu) {
				case 1:
				fileSave();
					break;
				case 2:
				fileOpen();
					break;
				case 3:
				fileEdit();
					break;
				case 9:
				System.out.println("프로그램을 종료합니다.");
					return;
				default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					break;
				}
		}
	}		
	
	
	
	//파일 명과 저장할 값을 받음
	
	public void fileSave() {
		while(true) {
		System.out.print("파일에 저장할 내용을 입력하세요."
						+"\r\n ex끝it 이라고 입력하면 종료됩니다."
						+"\r\n 내용 :");
		
		String txt = sc.nextLine();
			if(txt.equals("ex끝it")) {
				break;
			}
			result = result + txt+ "\r\n";
		
		// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장

		System.out.print("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
		String fname = sc.nextLine();
		
		if(!isFileExist) {
			fc.fileSave(fname, sb);
			return;
		}
		
		System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
		char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch=='Y') {
				fc.fileSave(fname, sb);
			}else {
				continue;
			}
			
			break;
		
		}
//		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
//		// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
//		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
//		// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
//		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
//		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
	}
	
	//파일 명을 받아 저장된 데이터 출력
	public void fileOpen() {
		System.out.println("열 파일 명 : "); 
		String fileName = sc.nextLine();
	
		boolean exists = fc.checkName(fileName);
		
		if(!exists) {
			System.out.println("없는 파일입니다.");
			return;
		}
		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
//		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
//		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
		System.out.println(fc.fileOpen(fileName));
	}
	
	//파일 명과 저장할 값을 받음
	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		boolean exists = fc.checkName(fileName);
		
		if(!exists) {
			System.out.println("없는 파일입니다.");
			return;
		}
		StringBuilder sb = addText();
		fc.fileEdit(fileName, sb);
//			// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
//			// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
//			// 반환 값이 true일 경우 fileSave()처럼 안내문 출력 후 내용에 대해 받음
//			// ex끝it를 입력하면 반복문 종료 후 fc의 fileEdit()에 파일 명과 StringBuilder 전달
	}
	
	private StringBuilder addText() {
		StringBuilder sb = new StringBuilder();
		while(true) {
			System.out.print("파일에 저장할 내용을 입력하세요."
							+"\r\n ex끝it 이라고 입력하면 종료됩니다."
							+"\r\n 내용 :");
			
			String txt = sc.nextLine();
				if(txt.equals("ex끝it")) {
					break;
				}
				sb.append(txt+"\n");
		}
		return sb;
	}	
}

package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
		//멤버 변수
	public void inputMenu() {
	
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt(); 
		
		
	}
	
	public void triangleMenu() {
		
	}
	
	public void squareMenu() {
		
	}
	
	public void inputSize(int type, int MenuNum) {
		
	}
	
	public void printlnformation(int type) {
		
	}
}

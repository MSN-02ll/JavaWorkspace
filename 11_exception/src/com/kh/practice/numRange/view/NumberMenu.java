package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		// 사용자에게 두 정수를 입력 받아 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
			int num1 = sc.nextInt();
		System.out.print("정수2 : ");
			int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
			
		try {
			boolean result = nc.checkDouble(num1, num2);
				System.out.println(num1+"은(는) " 
							+num2 + "의 배수인가 ? "+result);
			}catch(NumRangeException e) {
				e.printStackTrace();
		}
		
	}
	
}

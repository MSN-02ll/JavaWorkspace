package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
	int[]arr = new int[10];
		for(int i=arr.length-1; i>=0; i--) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice2() {
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice3() {
		int [] arr = new int [10];
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*10)+1;
			arr[i]=random;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice4() {
		String str = "월화수목금토일";
		char[] day = str.toCharArray();
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num>6 || num<0) System.out.println("잘못 입력하셨습니다.");
		
		if(num<=6 && num>=0) {
			System.out.println(day[num]+"요일");
		}
	}
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
	
		int sum = 0; 
		
		for(int i=0; i<arr.length; i++) {
		System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
		int an = sc.nextInt();
		arr[i]=an;
		sum += an;
		}
		for(int j=0; j<arr.length; j++) {
		System.out.print(arr[j]+" ");
		}
		System.out.println("\n총 합: "+sum);
	}
	public void practice6() {
		System.out.print("문자열 : ");
		String str = sc.next();
		char [] arr = str.toCharArray();
		int count = 0;
		// 전체 문자 반복
		System.out.print("문자열에 있는 문자 : ");
		for(int i =0; i<arr.length; i++) {
			char ch = arr[i]; //중복인지 검사하고자 하는 문자.
			//문자 중복 검사
			// 현재 위치에서 앞쪽의 단어들 중 현재 단어들과
			boolean isDup = false;
			for(int j=0; j<i; j++) {
				if(ch == arr[j]) {
					//중복
					isDup = true;
					break;
				}
			}
			if(!isDup && i<arr.length-1){
				System.out.print(ch+","+" ");
				count++;
				continue;
			}
			if(i==arr.length-1) {
				System.out.print(ch);
				count++;
			}
		}
		System.out.println("\n문자 개수: "+count);
	}
	public void practice7() {
		System.out.print("문자열 : ");
		String str1 = sc.next();
		char [] arr = str1.toCharArray();
		
		System.out.print("문자 : ");
		char c1 = sc.next().charAt(0);
		
		int count=0;
		System.out.print(str1+"에 "+c1+"이(가) 존재하는 위치(인덱스) : ");
		//중복을 통해서 위치와 개수 잡아낼 것
		for(int i=0; i<arr.length; i++) {
			char c2 = arr[i];
			
			boolean isDup = false;
			if(c1==c2) {
				isDup = true;
				System.out.print(i+" ");
				count++;
			}	
		}
		System.out.println("\n"+c1+" 개수 : " + count);
	}
	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char [] arr = str.toCharArray();
		
		char [] copy = new char [14];
		
		System.arraycopy(arr, 0, copy, 0, 8);
		for(int i=0; i<arr.length; i++) {
			if(i<8)System.out.print(arr[i]);
			if(i>=8&&i<=14) System.out.print("*");
		}
	}
	public void practice9() {
		int [] arr = new int[10];
		
		int random = (int)(Math.random()*10)+1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=random;
			System.out.print(arr[i]+" ");
			boolean isBig = false;
			boolean isSmall = false;
			
		}
	}
}

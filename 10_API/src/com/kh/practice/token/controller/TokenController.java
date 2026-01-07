package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		//기본생성자
	}
		
	public String afterToken(String str) {
		// 공백을 토큰으로 처리한 문자열 반환
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		
		//방법 1. replace
//		System.out.println(str.replace(" ", ""));
		
		//방법 2. split(" )을 활용하여 " "기준 문자를 분리하고, 분리된 문자를 다시 하나로 합친다.
//		String[] arr = str.split(" );// [j,a,v,a,...])
//		String result = "";
//		for(string s: arr) {
//			result =+ s;
//		}
//		System.out.println("split : " +result);

		//방법 3. StringTokenizer 이용
		StringTokenizer stn = new StringTokenizer(str," ");
		String result = "";
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		}
		
		return result;
	}
	
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 
		// 첫 글자만 대문자로 바꾼 문자열 반환
		String first = input
						.substring(0,1)
						.toUpperCase()
						.concat(input.substring(1));
		
		String other = input
						.substring(1);
		//return first+other;
		return first;
	}
	
	public int findChar(String input, char one) {
		// 문자열 안에 찾을 문자 개수가 몇 개 들어가있느지 반환
		
		char[] arr = input.toCharArray();
		int count =0;
		for(char ch : arr) {
			if(ch == one) {
				count++;
				
			}
		}
		return count;
		
	}
	
}

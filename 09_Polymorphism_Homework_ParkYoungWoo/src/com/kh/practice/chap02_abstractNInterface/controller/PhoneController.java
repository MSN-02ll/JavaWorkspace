package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {

	private String [] result = new String[2];
		// 필드
	
	public String[] method() {
		// 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
		Phone[] arr = new Phone[2];
		// 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
		arr[0] = new GalayNote9();
		arr[1] = new V40();
		
		// 1안
		for(int i = 0; i<arr.length; i++) {
			((SmartPhone)arr[i]).printInformation();
		}
		// 2안
		
		
		// for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의
		// 반환 값을 String배열에 담아 반환
		
		}	
		
}

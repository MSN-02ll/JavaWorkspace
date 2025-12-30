package com.kh.practice.snack.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	// 기능담당
	private Snack s = new Snack();
	
	public SnackController() {
		
	}
	public String saveData(String kind, String name, String flavor,
	int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNomOf(numOf);
		s.setPrice(price);
		
		return "저장완료";
		
	}
	public String confirmData() {
		return s.information();
	}
}

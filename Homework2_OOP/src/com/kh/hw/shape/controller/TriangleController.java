package com.kh.hw.shape.controller;

import com.hk.hw.shape.model.vo.Shape;

public class TriangleController {

	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		
		double ar2 = 0;
		
		s.setHeight(height);
		s.setWidth(width);
		
		ar2 = (height * width)/2;
		
		return ar2;
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print() {
		return "삼각형" + s.information();
	}
}

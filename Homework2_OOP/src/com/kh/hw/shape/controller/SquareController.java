package com.kh.hw.shape.controller;

import com.hk.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		
		double pm = 0;
		
		s.setHeight(height);
		s.setWidth(width);
		
		pm = (height+width)*2;
		
		return pm;	
	}
	
	public double calcArea(double height, double width) {
		
		double ar = 0;
		
		s.setHeight(height);
		s.setWidth(width);
		
		ar = height * width;
		
		return ar;
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
	}
	
	public String print() {
		
		return "사각형"+s.information();
		
	}
	
}

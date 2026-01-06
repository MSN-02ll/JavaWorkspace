package com.kh.chap02_abstract.part02.model.vo;

public class Baby extends Person {

	
	public Baby() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void eat() {
		setWeight(getWeight() + 3);
		setHealth(getHealth() + 1);
	}
	
	public void sleep() {
		setHealth(getHealth() +3);
		
	}
}

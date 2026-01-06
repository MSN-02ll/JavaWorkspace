package com.kh.chap02_abstract.part02.model.vo;

// 인터페이스 상속 (implements)
// - 클래스와 클래스의 상속 관계(단일상속) : 클래스명 extends 부모클래스
// - 클래서와 인터페이스의 상속 관계(다중상속) : 클래스명 implements 인터페이스 1, 인터페이스 2, 3...
// - 인터페이스와 인터페이스의 상속 관계(다중상속) : 인터페이스명 extends 인터페이스 1, 인터페이스 2, 3...

public class Mother extends Person implements Basic{
//순서 => extends 다음 implements
	private String babyBirth; // 아기의 탄생여부 저장: 출산, 입양, 없음
	
	public Mother() {
		
	}
	
	
	
	@Override
	public void eat() {
		setWeight(getWeight() + 10);
		setHealth(getHealth() - 10);
	}

	@Override
	public void sleep() {
		setHealth(getHealth() + 10);
	}

	public String getBabyBirth() {
		return babyBirth;
	}



	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + "]";
	}
}

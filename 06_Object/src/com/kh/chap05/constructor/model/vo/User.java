package com.kh.chap05.constructor.model.vo;

public class User {
	//필드부
	private String userId;
	private int age;
	private char gender;
	
	//생성자부
	/*
	 * 생성자
	 * 	- 객체를 생성하는 기능을 담당
	 *  [표현법]
	 *  public 클래스명 ([매개변수]-생략가능){
	 *    // 생성자를 통해 객체 생성시 실행할 코드
	 *    // 반환형이 없다, bcs 자기자신 반환하기 때문
	 *  }
	 *  
	 *  생성자를 작성하는 목적
	 *  1. 객체를 생성해주기 위함
	 *  2. 객체생성과 동시에 매개변수로 전달된 값을 통해 
	 *  	필드를 초기화할 목적으로도 사용
	 *  
	 *  생성자 작성 시 주의사항
	 *  1. 클래스명과 동일해야한다 (대/소문자 포함)
	 *  2. 반환형이 존재하지 않는다.
	 *  3. 여러개 생성이 가능하지만, 매개변수가 중복되면 안된다
	 *  	(메서드 오버로딩과 동일한 개념)
	 *  4. 매개변수 생성자를 명시적으로 작성하게 되면, 
	 *  	기본생성자를 jvm이 만들어주지 않는다. 
	 
	 * */
	
	// 기본 생정자
	// - 생성자 미 작성시 Jvm이 자동으로 만들어주는 생성자
	// - 되도록 항상 기본생성자를 추가하는 습관을 가질 것.
	public User() {
		System.out.println("기본생성자 호출");
	
	}
	// 매개변수있는 생성자
	// - 전달받은 매개변수를 통해 필드를 초기화할 목적으로 사용하는 생성자
	public User(String userId) {
		this.userId = userId;
	}
	
	//매개변수있는 생성자2
	public User(String userId, int age, char gender) {
		// 다른 생성자에서 동일한 필드값을 초기화 하고 있는 경우,
		// 현재 생성자에서 다른 생성자를 호출하는 방식으로 코드를 줄일수 있다.
		
		this(userId);//this.userId = userId; - 단 무조건 생성자 첫줄에
		
		//this(); = this 생성자 호출 => 값이 없으면 기본 생성자
		this.userId = userId;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	// 메서드부
	// set/get메서드 생성
		// set => 값을 저장하기 위한 용도, 매개변수 void
		// 		  따라서 값이 필요하다, 매개변수에서 가져옴
	public void setUserId(String userId) {
		this.userId = userId;
	}
		// get => 특정 값을 꺼내기 위한 용도, 매개변수 필요 없음
	public String getUserId() {
		return this.userId;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return this.gender;
	}
	
	
}

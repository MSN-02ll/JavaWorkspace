package com.kh.chap06.method.model.vo;

public class MethodTest1 {

	/*
	 *  [표현법]
	 *  접근제한자 에약어 자료형 메서드명([매개변수]){
	 *  		반환할 값에 맞춰 적어야함
	 *  
	 *  			void => 반환할 값 없음
	 *  
	 *  // 수행할 코드
	 *  
	 *  return 반환할 값; (생략가능)
	 *  }
	 * */
	
	// 1. 매개변수가 없고, 반환할 값도 없는 메서드
	public void method1() {
		System.out.println("매개변수 x, 반환값 x");
		
	//	return(반환값); => void는 return생략 가능 => jvm이 알아서 넣어주기 때문
	}
	
	// 2. 매개변수 x, 반환형 O
	public int method2(){
		System.out.println("매개변수 x, 반환값 O");
		int random = (int)(Math.random() * 100 +1);
		
		return random;
	}
	
	// 3. 매개변수 o, 반환형 x
	public void method3(int x, int y) {
		int min = 0;
		int max = 0;
		
		if(x>y) {
			min = y;
			max = x;
		}else {
			min = x;
			max = y;
		}
		
		System.out.println("최소값 : "+min+", 최대값 : "+max);
	}
	
	//4. 매개변수 o, 반환형 o
	public int multiply(int a, int b) {
		return a*b;
	}
}

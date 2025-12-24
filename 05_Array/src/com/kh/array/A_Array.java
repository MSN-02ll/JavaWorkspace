package com.kh.array;

import java.util.Arrays;

public class A_Array {

	/*
	 * 변수 : 하나의 공간에 하나의 값을 저장할 수 있는 저장공간.
	 * 	int a = 10;
	 * 	a = 20;
	 * (Java의 배열은 원시적 배열)
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있다.("같은 자료형" 기준)
	 * 		ex) int[] a = new int[3];
	 * 		int자료형 값을 담을 수 있는 저장공간이 3칸 할당된다.(4byte * 3)
	 * 		[0, 0, 0]
	 * 		배열에서 저장된 데이터를 꺼낼 때는 "인덱스"를 활용하며, 인덱스 값은 0부터 시작.
	 * 		arr[0], arr[1], arr[2]// 배열의 크기 = 3/ 인덱스는 2
	 * 		배열의 크기가 만약 5라면, 배열의 마지막 인덱스는 4
	 * 				n		 ,		   n-1
	 * */
	
	public void method1() {
		/*
		 * 배열 선언
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 * */
		int a;
		int [] arr;
		int arr2 [];
		
		/*
		 * 배열 할당
		 * - 이 배열에 몇 개의 값들을 보관할건지 그 배열의 크기를 지정해주는 과정
		 * - 크기를 지정해주면, 지정한 갯수만큼의 저장공간을 가진 배열이 생성
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 * */
		
		arr = new int[5]; // 할당 완료.
		int [] arr3 = new int[5];// [0,0,0,0,0]
		//System.out.println(a);
		System.out.println(arr3[0]);
		
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3; // [1,2,3,0,0]
		
		System.out.println(arr3[3]);
		System.out.println(arr3[2]);
		System.out.println(arr3);// 주소값 출력/ 참조형변수//[I@626b2d4a 일때, [<<괄호(차원표시) I<<int @<<기준점
		//heap은 항상 어떤 값으로 채워져있어야한다. 
		//그렇지 않으면 운용시에 에러가 생길 가능성이 높다.
	}
	
	public void method2() {
		int num = 10;
		//모든 지역 변수는 저장공간 stack에 저장
		int [] iArr = new int[5]; // [0,0,0,0,0]
		//참조형 변수는 byte는 4혹은 8로 저장
		//new라고 적힌 모든 구문은 heap 메모리로 저장
		
		System.out.println("iArr : " + iArr); 
		// 배열에 저장한 값이 아닌 주소 값이 나옴
		System.out.println("iArr의 HashCode : "+ iArr.hashCode());
		//참조형 변수의 HashCode = > 주소값을 10진수 형태로 변경해주는 함수
		int [] iArr2 = new int[5]; // [0,0,0,0,0]
		System.out.println("iArr2의 HashCode : "+ iArr2.hashCode());
		
		int [] iArr3 = iArr2;// stat에 iArr2 값을 넣음.
		System.out.println("iArr3의 HashCode : "+iArr3.hashCode());
		
		System.out.println(iArr == iArr2); //false
		System.out.println(iArr2 == iArr3); //true
	}
		/*
		 * stack 메모리
		 * 
		 * stack => 쌓다의 의미
		 * 프로그램은 stack 메모리 가장 상부에 있는 메모리 먼저 사용됨
		 *  LIFO(Last In First Out)
		 * 사용됨 => stack 메모리에서 사라짐
		 * main 먼저 => 이후 method A, B, C....
		 * 메서드 안에서 => stack
		 * class 안에서 => heap 메모리
		 * static과 heap => 메모리 공유 가능 but 주로 heap
		 * 
		 *  heap 메모리는 일종의 공유메모리
		 *
		 * */
	public void method3() {
		int [] iArr = new int[5];
		
		// 배열 값 초기화
		// iArr.length : 배열의 크기를 저장하는 변수
		for(int i = 0; i< iArr.length; i++) {
			iArr[i] = i;
		}
		
		// [0, 1, 2, 3, 4]
		System.out.println(iArr[4]);
	}
	
	public void method4() {
		int result = 0;
		String str= null;
		//String str=""; => 빈문자로 초기화하는 경우가 많다.
		int[] arr = null;
		
		// null은 모든 참조자료형의 기본값이다
		// 단, 참조변수가 null을 저장한 상태에서, 
		// 주소값이 있어야 수행할 수 있는 행위를 
		// 코드로 작성하면 실행시 에러가 발생한다.
		
		System.out.println(arr.length);
		System.out.println(arr[0]);
	}
	
	public void method5() {
		int [] arr = new int[5];
		
		/*
		 * arr[1] = 2;
		 * arr[2] = 4;
		 * arr[3] = 6;
		 * arr[4] = 8;
		 * arr[5] = 10;
		 *  1. 반복문을 활용하여 배열 초기화 하기.
		 *  
		 *  2. 초기화 완료된 배열을 반복문을 활용하여 내부에 저장된 값을 출력
		 *  출력형식 : 10 8 6 4 2
		 * */
		int value = 2;
		for(int i = 1; i< arr.length; i++) {
			arr[i]= value;
			value +=2;
		}
		
		// 값 출력
		for(int i = arr.length -1; i> -1; i--) {
			System.out.println(arr[i]+" ");
		}
		
		arr[5]=12;//java는 에러가 난다(프로그램 언어마다 조금 다르다)
		// 배열의 크기를 벗어난 인덱스 제시시 에러 발생.
		//처음에 설정한 배열 크기를 수정(확장 또는 축소)할 수 없다
		//배려의 범위를 넘어선 값들을 저장하고자 한다면, 새로운 배열을 생성해야함.
		
		arr = new int[6];// 기존 값 초기화 => 배열 복사 필요
		arr[5] = 12;
	}
	public void method6() {
		// 배열의 선언, 할당, 초기화를 한번에 수행하는 방법.
		// 방법 1
		int[] arr1 = new int[] {1,2,3,4};// [1,2,3,4]
		
		// 방법 2(생략형태)
		int[]arr2 = {1,2,3,4};
	}
	public void method7() {
		//문자열을 문재배열로 만드는 방법
		// 방법 1 toCharArray()함수 사용
		String str = "merry";
		char[] arr = str.toCharArray();// ['m','e','r','r','y']
		
		// 방법 2 for문으로 문자배열 생성하여 옮겨담기
		char[] arr2= new char[str.length()];
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = str.charAt(i);
		}
		
		int[] arr3 = new int[3];
		
		System.out.println(Arrays.toString(arr));// 문자형 배열 출력
		System.out.println(arr2);//int값, string값, 등 참조형 변수값 프린트, 
		// char는 println시 배열 안의 글자들을 모아서 출력
		System.out.println(Arrays.toString(arr3));
	}
		
	
}

package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
	
		while(true) {
		System.out.print("1. 성적 저장" 
					+ "\n2. 성적 출력" 
					+ "\n9. 끝내기"
					+ "\n입력 : ");
		int menu = sc.nextInt();

		switch(menu) {
		case 1:
			saveScore();
			break;
		case 2:
			readScore();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
		default :
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			break;
		}
		
		}
	}
	public void saveScore() {
		
		int num = 0; // 학생 숫자를 나타낼 변수
	
		for(num = 1; num>0; num++) {
		System.out.println(num+"번 째 학생 정보 기록");					
		System.out.print("이름 : ");
			String name = sc.next();
		System.out.print("국어 점수 : "); 
		 	int kor = sc.nextInt(); 		
		System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
		int sum = kor+eng+math;
		double avg = (kor+eng+math)/3.0;
		
		scr.saveScore(name, kor, eng, math, sum, avg);
			
		System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
			if(ch == 'N') {
				return;
			}
		}
	}		
		// ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고
		// 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌
		
		// N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함
		// N이나 n을 입력하면 사용자에게 받는 반복문을 나
		
	public void readScore() {

		int count = 0; // 몇 명의 학생인지(반복문이 몇 번 실행됐는지) 담을 변수
		
		int sumAll = 0;
		
		double avgAll = 0.0;
		
		
		
		try(DataInputStream dis = scr.readScore();){
			while(true) {
				System.out.println("이름\t국어\t영어\t수학");
				System.out.print(dis.readUTF() +"\t"
				+dis.readInt()+"\t"+dis.readInt()+"\t"+dis.readInt());
				int sum = dis.readInt();
				double avg = dis.readDouble();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("읽은 횟수\t전체 합계\t전체 평균");
			System.out.println(count+"\t"+sumAll+"\t"+(avgAll/count));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println("이름"+"   "+"국어"+"   "+"영어"+"   "+"수학"+"   "+"총점"+"   "+"평균"+"   ");
//		for (int i =1; i<count; i++) {
//			System.out.println(name+"   "+"kr"+"   "+"영어"+"   "+"수학"+"   "+"총점"+"   "+"평균"+"   ");
		// 모든 학생들의 합과 평균을 담을 변수
		// scr의 readScore()의 반환 값을 DataInputStream에 담고 반복문을 이용하여
		// 안에 들어가있는 데이터를 가지고 와서 출력
		// 모든 파일이 읽어졌을 때 나오는 EOFException을 이용하여
		// EOFException가 일어났을 때 읽은 회수, 전체 합계, 전체 평균 출력
	}
	
}

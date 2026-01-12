package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	Music ms = new Music();
	
	public void mainMenu() {
	
		while(true) { // 메뉴 화면 반복 실행 처리
		System.out.print("******* 메인 메뉴 *******"
						+"\n1. 마지막 위치에 곡 추가" // addList() 실행
						+"\n2. 첫 위치에 곡 추가" // addAtZero()
						+"\n3. 전체 곡 목록 출력" // printAll()
						+"\n4. 특정 곡 검색" // searchMusic()
						+"\n5. 특정 곡 삭제" // removeMusic()
						+"\n6. 특정 곡 정보 수정" // setMusic()
						+"\n7. 곡명 오름차순 정렬" // ascTitle()
						+"\n8. 가수명 내림차순 정렬" // descSinger()
						+"\n9. 종료" // “종료” 출력 후  main()으로 리턴
						+"\n메뉴 번호 선택 : ");		//>> 입력 받음
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			addList();
			break;
		case 2 :
			addAtZero();
			break;
		case 3 :
			printAll();
			break;
		case 4 :
			searchMusic();
			break;
		case 5 :
			removeMusic();
			break;
		case 6 :
			setMusic();
			break;
		case 7 :
			ascTitle();
			break;
		case 8 :
			descSinger();
			break;
		case 9 :
			System.out.println("종료");
			return;
		}
		
		}
	}
	public void addList() {
		
		System.out.print("****** 마지막 위치에 곡 추가 ******"
						+"\n곡 명 : ");
		String title = sc.next();
		
		System.out.print("가수 명 : ");
		String singer = sc.next();
	
		int result = mc.addList(ms);
		
		if(result ==1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
		
		
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		
	}
	public void addAtZero() {
		
		System.out.print("****** 첫 위치에 곡 추가 ******"
				+"\n곡 명 : ");
			String title = sc.next();

		System.out.print("가수 명 : ");
			String singer = sc.next();
			
			int result = mc.addAtZero(ms);
			
			if(result ==1) {
				System.out.println("추가 성공");
			}else {
				System.out.println("추가 실패");
			}
		
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
		
	}
	public void printAll() {
		
		System.out.print("****** 전체 곡 목록 출력 ******"
						+"\n"+mc.printAll());
		
		// MusicController에 printAll() 반환 값을 출력한다.
	}
	public void searchMusic() {
		
		System.out.print("****** 특정 곡 검색 ******"
						+ "검색할 곡 명 : ");
			String title = sc.next();
			Music m = mc.searchMusic(title);
			
			if(m == null) {
				System.out.println("검색한 곡이 없습니다.");
			}else {
				System.out.print("검색한 곡은 "
						+m.getTitle()
						+"("
						+m.getSinger()
						+")");
			}
		// 사용자에게 곡 이름을 받고 MusicController에 있는 searchMusic으로 값을 넘긴다.
		// searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
		// 반환 값이 있으면 “검색한 곡은 000(곡 명, 가수 명) 입니다.” 콘솔 창에 출력
		
	}
	public void removeMusic() {
		
		System.out.print("****** 특정 곡 삭제 ******"
				+ "검색할 곡 명 : ");
		String title = sc.next();
		Music m = mc.searchMusic(title);
		
		if(m == null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.print("삭제한 곡은 "
					+m.getTitle()
					+"("
					+m.getSinger()
					+")");
		}
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
		// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “ 삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “000(곡 명, 가수 명)을 삭제 했습니다” 콘솔 창에 출력
		
	}
	public void setMusic() {
		
		//****** 특정 곡 정보 수정 ******
		
		mc.stmusic(title,null);
		
//		Music m mc.setMusic(title, newMusic(title2,singer));
//		
//		if(mull null) {
//			
//		}
		
		// 사용자에게 수정할 곡을 입력 하여 MusicController에 setMusic으로 검색 할 수 있게
		// 값을 넘기며 수정할 곡 명과 가수 명을 받아 setMusic으로 값을 넘긴다.
		// 검색 결과 값이 없으면 “수정할 곡이 없습니다.”, 검색 결과 값이 있고
		// 수정 했으면 “000(곡 명, 가수 명)의 값이 변경 되었습니다.” 콘솔 창에 출력
		
	}
	public void ascTitle() {
		
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int result = mc.ascTitle();
		if(result ==1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
		
		
		// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
		
	}
	public void descSinger() {
		
		System.out.println("****** 가수 명 내림차순 정렬 *****");
			int result = mc.ascTitle();
				if(result ==1) {
					System.out.println("정렬 성공");
				}else {
					System.out.println("정렬 실패");
				}
			}
		
				
		// musicController에 descSinger()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패”
	}
	
}

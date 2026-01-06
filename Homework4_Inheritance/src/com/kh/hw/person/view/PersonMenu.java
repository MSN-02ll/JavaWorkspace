package com.kh.hw.person.view;

public class PersonMenu {

	
	public void mainMenu() {
		int [] count = pc.personCount();
		System.out.println("can save Student til 3 in Maximum. \r\n"
				+)
		
		intmenu = sc.nextInt();
		
		switch(menu) {
		case 1:
			studentMenu();
		case 2:
		case 9:
		default:
			System.out.println("type wrong text.");
		}
	}
	
	public void studentMenu() {
		while(true) {
			System.out.println("메뉴명");
			System.out.println("1.학생 추가");
			System.out.println("2. check student");
			System.out.println("");
			int count = pc.personCount()[0];
			int menu - sc.nextInt():
			
			switch(menu)
			case 1:
				if(count == 3+)	{
					System.out.println("you type wrong text. please type again.");
					continue;
				}
				
				insertStudent();
				break;
	}
		
		
	public void insertStudent() {
		
		while(true) {
		System.out.println("Student name : ");
		String name = sc.next();
		
		System.out.println("Student age : ");
		int age = sc.next();
		
		System.out.println("Student height : ");
		double height = sc.next();
		
		System.out.println("Student weight : ");
		double weight = sc.next();
		
		System.out.println("Student grade : ");
		int grade = sc.next();
		
		System.out.println("Student major : ");
		String major = sc.next();
		
		pc.insertStudent (name, age, height, weight, grade,major)
		
		int count = pc.personCount()[0];
		if(count !=3) {
			System.out.println("if you want to stop, press N(orn). if you want to continue, just press other keys." ");"
					
					if(ch=='N'){break;
					
					}else {
						
					}
					
		}
		}
	}
		
	
	
		
	}
	
}

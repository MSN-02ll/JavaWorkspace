package com.kh.hw.person.controller;

public class PersonController {

	
	
	public int [] personCount() {
		
		int[] arr = new int[2];
		// 1. count Students and save.		
			int count = 0;

		for(Student std : s) {
			if(stid != null) {
				count++;
			}
		}
		
		arr[0] = count;
		
		count = 0;
		for(Employee emp : e) {
			if(emp != null) {
				count++;
			}
		}
		arr[1] = 
			return;
	}
	
	public void insertStudent(String name, int age, double height, double weight,int grade,String major) {
		Student std = new Student(name, age, height, weight, grade, major);
		for(int i =0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = std;
				break;
			}
		}
	}
	
	public void printStudent(){
		Student [] s = pc.printStudent();
		for(Student std : s) {
			if(std !=null) System.out.println(std);
			
		}
	}
}

package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal [] arr = new Animal[5];
		arr[0] = new Dog("A", "말티즈", 3);
		arr[1] = new Dog("B", "진돗개", 5);
		arr[2] = new Cat("네로","코숏","부천","검은색");
		arr[3] = new Cat("코코","브숏","목동","회색");
		arr[4] = new Dog("C", "차우차우", 6);
				
		for(Animal ani : arr) {
			ani.speak();
		}
		
	}
}

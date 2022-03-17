package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App04 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		Pet pet1 = chihuahua;
		
		Cat cat = new Cat();
		Pet pet2 = cat;
		
		pet1.roll();
		pet2.roll();
		
		Tiger tiger = new Tiger();
//		Pet pet3 = tiger; // x
		Wolf wolf = new Wolf();
//		Pet pet4 = wolf; // x
		
		method(pet1);
		method(pet2);
		method(new Chihuahua());
		method(new Cat());
	}
	
	public static void method(Pet pet) {
		pet.roll();
	}
}

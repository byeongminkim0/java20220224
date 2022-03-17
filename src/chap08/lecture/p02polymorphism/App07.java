package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App07 {
	public static void main(String[] args) {
		Pet pet = new Chihuahua();
		pet.roll();
		
		Helper helper = (Helper) pet;
		helper.help();
	}
}

package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App05 {
	public static void main(String[] args) {
		Retriever dog = new Retriever();
		Helper helper = dog;
		Pet pet = dog;
		Animal animal = dog;
		
		helper.help();
		pet.roll();
		animal.cry();
		
	}
}

package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.*;

public class App08 {
	public static void main(String[] args) {
		// instanceof
		
		Retriever animal1 = new Retriever();
		
		System.out.println(animal1 instanceof Retriever); // true
		System.out.println(animal1 instanceof Animal); // true
		System.out.println(animal1 instanceof Canine); // true
		System.out.println(animal1 instanceof Pet); // true
		System.out.println(animal1 instanceof Helper); // true
		
		if(animal1 instanceof Helper) {
			Helper helper = (Helper) animal1;
			helper.help();
		}
	}
}

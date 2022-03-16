package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App06 {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		Animal a1 = o1.getAnimal1();
		a1.breathe();
		a1.cry();
		
		Animal a2 = o1.getAnimal2();
		a2.breathe();
		a2.cry();
		
		Animal a3 = o1.getAnimal3();
		a3.breathe();
		a3.cry();
		
		Animal a4 = o1.getAnimal4();
		a4.breathe();
		a4.cry();
		
		Animal a5 = o1.getAnimal5();
		a5.breathe();
		a5.cry();
		
	}
}

class MyClass06 {
	private Animal animal1;
	private Animal animal2;
	private Animal animal3;
	private Animal animal4;
	private Animal animal5;
	
	MyClass06() {
		animal1 = new Animal();
		animal2 = new Canine();
		animal3 = new Feline();
		animal4 = new Chihuahua();
		animal5 = new StreetCat();
	}

	public Animal getAnimal1() {
		return animal1;
	}

	public Animal getAnimal2() {
		return animal2;
	}

	public Animal getAnimal3() {
		return animal3;
	}

	public Animal getAnimal4() {
		return animal4;
	}

	public Animal getAnimal5() {
		return animal5;
	}
	
	
}
package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App10 {
	public static void main(String[] args) {
		// instanceof : 이항 연산자
		// 좌항 : 참조변수, 우항 : 타입명
		// 연산결과 : boolean, 참조변수가 가리키는 인스턴스가 타입과 일치하면 true, 아니면 false
		
		Animal animal = new Chihuahua();
		
		boolean b1 = animal instanceof Animal; // true
		System.out.println(b1);
		
		boolean b2 = animal instanceof Canine; // true
		System.out.println(b2);
		
		boolean b3 = animal instanceof Chihuahua; // true
		System.out.println(b3);
		
		boolean b4 = animal instanceof Feline; // false
		System.out.println(b4);
		
		boolean b5 = animal instanceof StreetCat; // false
		System.out.println(b5);
		
		if(animal instanceof Canine) {
			Canine canine = (Canine) animal;
		}
		
		if(animal instanceof Chihuahua) {
			Chihuahua chihuahua = (Chihuahua) animal;
			chihuahua.angry();
		}

		if(animal instanceof Feline) {
			Feline feline = (Feline) animal;
		}
		
		if(animal instanceof StreetCat) {
			StreetCat streetCat = (StreetCat) animal;
		}
	}
}

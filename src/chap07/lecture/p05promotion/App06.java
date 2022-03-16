package chap07.lecture.p05promotion;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App06 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		StreetCat streetCat = new StreetCat();
		
		Canine canine = chihuahua;
		Feline feline = streetCat;
		
		Animal animal1 = canine;
		Animal animal2 = feline;
		
		Animal animal3 = chihuahua;
		Animal animal4 = streetCat;
	}
}

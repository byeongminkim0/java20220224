package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App03 {
	public static void main(String[] args) {
		Animal[] arr1 = new Animal[5];
		
		arr1[0] = new Animal();
		arr1[1] = new Canine();
		arr1[2] = new Feline();
		arr1[3] = new Chihuahua();
		arr1[4] = new StreetCat();
		
		arr1[0].breathe();
		arr1[1].breathe();
		arr1[2].breathe();
		arr1[3].breathe();
		arr1[4].breathe();
		
		arr1[0].cry();
		arr1[1].cry();
		arr1[2].cry();
		arr1[3].cry();
		arr1[4].cry();
	}
	
	
}







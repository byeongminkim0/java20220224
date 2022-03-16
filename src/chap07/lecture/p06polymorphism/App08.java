package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App08 {
	public static void main(String[] args) {
		Animal animal = new Chihuahua();
		animal.breathe();
		animal.cry();
		
		// angry 메소드 실해하고 싶다.
		Chihuahua chihuahua = (Chihuahua) animal; // 강제 형변환 (casting)
		chihuahua.angry();
	}
}

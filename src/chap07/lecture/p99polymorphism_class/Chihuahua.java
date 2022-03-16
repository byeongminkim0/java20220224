package chap07.lecture.p99polymorphism_class;

public class Chihuahua extends Canine {
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	public void angry() {
		System.out.println("화가 난다!!!!");
	}
}

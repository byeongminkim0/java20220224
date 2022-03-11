package chap06.lecture.p05static;

public class App01 {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.age = 3;
		o1.method1();
		
		MyClass01 o2 = new MyClass01();
		o2.age = 5;
		o2.method1();
		
		// 클래스명으로 클래스 멤버 접근가능
		MyClass01.height = 100; 
//		MyClass01.age = 99; // xxx
		MyClass01.method2();
//		MyClass01.method1(); // xxx
	}
}

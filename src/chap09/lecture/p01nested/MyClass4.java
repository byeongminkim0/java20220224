package chap09.lecture.p01nested;

public class MyClass4 {
	// static 중첩 클래스
	// instance 중첩 클래스
	
	// local 클래스 : 메소드 내에 선언된 클래스
	void method1() {
		class LocalClass1 {
			// 필드
			// 생성자
			// 메소드
		}
		
		LocalClass1 o1 = new LocalClass1();
		
	}
}

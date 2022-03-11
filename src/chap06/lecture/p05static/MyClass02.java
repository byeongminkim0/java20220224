package chap06.lecture.p05static;

public class MyClass02 {
	// 인스턴스 멤버끼리 접근 가능
	int field1;
	void method1() {
		System.out.println(field1);
		method2();
	}
	void method2() {
		// 인스턴스 멤버에서 스태틱(클래스) 멤버에 접근 가능
		System.out.println(field2);
	}
	
	
	// 스태틱(클래스) 멤버끼리 접근 가능
	static int field2;
	static void method3() {
		System.out.println(field2);
		method4();
	}
	static void method4() {
		// 스태틱(클래스) 멤버에서 인스턴스 멤버 접근 불가능
//		System.out.println(field1); // xxxx
	}
	
}








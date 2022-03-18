package chap09.lecture.p01nested;

public class MyClass5 {
	void method1() {
		// local class
		class LocalClass1 {
			// 로컬 클래스에서 static 멤버 사용 불가
			
			int field1;
			static int field2;// xxx
			
			void method1() {
			}
			
			static void method2() { // xxx
			}
		}
	}
}

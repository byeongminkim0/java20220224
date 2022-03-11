package chap06.lecture.p05static;

public class MyClass03 {
	static {
		// static block
		// 정적 초기화 블럭
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		field2 = sum;
	}
	
	static int field2;
	int field1;
	
	MyClass03() {
		field1 = 10;
	}
	
}

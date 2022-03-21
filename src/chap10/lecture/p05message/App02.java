package chap10.lecture.p05message;

public class App02 {
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		throw new RuntimeException("사용자 메세지");
	}
}

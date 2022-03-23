package chap11.lecture.p03wrapper;

public class App03 {
	public static void main(String[] args) {
		// 참조타입을 기본타입으로 변환
		Integer i1 = new Integer(333);
		int i2 = i1.intValue(); // unboxing
		
		// auto unboxing : 참조타입을 기본타입으로 자동 변환
		Integer i3 = new Integer(999);
		int i4 = i3; // auto unboxing
		
		
	}
}

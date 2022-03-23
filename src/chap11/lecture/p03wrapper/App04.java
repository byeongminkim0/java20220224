package chap11.lecture.p03wrapper;

public class App04 {
	public static void main(String[] args) {
		Integer i1 = new Integer(9999);
		Integer i2 = new Integer(9999);
		
		int i4 = i1; // auto unboxing
		int i5 = i2; // auto unboxing
		
		System.out.println(i4 == i5); // 9999 == 9999
		System.out.println(i1 == i2); // 참조값 비교
		System.out.println(i1.equals(i2)); // 참조타입 비교시 equals 사용
	}
}

package chap07.lecture.p05promotion;

public class App03 {
	public static void main(String[] args) {
		
	}
	
	public static SuperClass1 method1() {
		SuperClass1 o1 = new SuperClass1();
		SubClass1 o2 = new SubClass1();
		
//		return o1;
//		return o2;
		return new SubClass1();
	}
}

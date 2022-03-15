package chap07.lecture.p01inheritance;

public class App02 {
	public static void main(String[] args) {
		SuperClass1 o1 = new SuperClass1();
		o1.setField("필드값");
		System.out.println(o1.getField());
		o1.someMethod();
		
		SubClass1 o2 = new SubClass1();
		o2.setField("서브클래스 인스턴스 필드값");
		System.out.println(o2.getField());
		o2.someMethod();
	}
}

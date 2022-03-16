package chap07.lecture.p05promotion;

public class App05 {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.field = new SuperClass1();
		o1.field = new SubClass1(); // 자동 타입변환
		
		o1.setField2(new SuperClass1());
		o1.setField2(new SubClass1()); // 자동 타입변환
		
		SuperClass1 s1 = o1.getField2();
//		SubClass1 s2 = o1.getField2(); // 자동 타입변환 x
		SubClass1 s3 = o1.getField3();
		SuperClass1 s4 = o1.getField3(); // 자동 타입변환
	}
}

class MyClass5 {
	public SuperClass1 field;
	private SuperClass1 field2;
	private SubClass1 field3;
	
	public SubClass1 getField3() {
		return field3;
	}
	
	public SuperClass1 getField2() {
		return field2;
	}
	public void setField2(SuperClass1 field2) {
		this.field2 = field2;
	}
}

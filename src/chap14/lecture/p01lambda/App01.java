package chap14.lecture.p01lambda;

public class App01 {
	public static void main(String[] args) {
		MyInterface1 o1 = new MyClass1();
		MyInterface1 o2 = new MyInterface1() {
			@Override
			public void method1() {
				
			}
		};
	}
}

interface MyInterface1 {
	void method1();
}

class MyClass1 implements MyInterface1 {
	@Override
	public void method1() {
		
	}
}
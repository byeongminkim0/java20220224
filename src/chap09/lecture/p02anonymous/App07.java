package chap09.lecture.p02anonymous;

public class App07 {
	public static void main(String[] args) {
		int var = 7; // final, effectively final
		
		MyInterface1 o1 = new MyInterface1() {
			@Override
			public void method1() {
				System.out.println(var);
			}
		};
//		var = 8;
		o1.method1();
	}
}

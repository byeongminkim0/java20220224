package chap09.lecture.p02anonymous;

public class App06 {
	public static void main(String[] args) {
		int var1 = 3; // final, effectively final
		
		class MyLocalClass1 implements MyInterface1 {
			@Override
			public void method1() {
				System.out.println(var1);
			}
		}
		
//		var1 = 9;
		
		MyInterface1 o1 = new MyLocalClass1();
		o1.method1();
	}
	
	
}

package chap09.lecture.p02anonymous;

public class App09 {
	public static void main(String[] args) {
		MyInterface1 o1 = new MyInterface1() {
			
			@Override
			public void method1() {
				System.out.println("추상 메소드 재정의!@!@!@@");
				method2();
			}
			
			public void method2() {
				System.out.println("필요해서 만든 메소드");
			}
		};
		
		o1.method2(); // xxx -> 인터페이스에서 디폴트 메소드 만들어서 해결함.
		o1.method1();
	}
}

package chap09.lecture.p02anonymous;

public class App05 {
	public static void main(String[] args) {
		MyAbstractClass1 o1 = new MyAbstractClass1() {
			@Override
			public void method1() {
				System.out.println("퍼블릭 메소드 재정의");
			}
			
			@Override
			protected void method2() {
				System.out.println("프로텍티드 메소드 재정의");
			}
			
			@Override
			void method3() {
				System.out.println("패키지프라이빗 메소드 재정의");
			}
		};
		
		o1.method1();
		o1.method2();
		o1.method3();
	}
}

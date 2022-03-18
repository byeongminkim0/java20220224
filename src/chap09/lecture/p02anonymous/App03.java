package chap09.lecture.p02anonymous;

public class App03 {
	public static void main(String[] args) {
		// 지역클래스 만드는 과정 생략
		// 즉, 클래스가 없음 (anonymous class)
		
		// 인터페이스 구현과, 인스턴스 생성을 한 번에 작성
		MyInterface1 o1 = new MyInterface1() {
			// 구현클래스 작성
			@Override
			public void mehtod1() {
				System.out.println("무명 클래스에서 재정의한 메소드1");
			}
		};
		
		o1.mehtod1();
	}
}

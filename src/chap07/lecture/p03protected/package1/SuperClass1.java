package chap07.lecture.p03protected.package1;

public class SuperClass1 {
	public void publicMethod() {
		System.out.println("퍼블릭 메소드");
	}
	
	protected void protectedMethod() {
		System.out.println("프로텍티드 메소드");
	}
	
	void defaultMethod() {
		System.out.println("패키지 프라이빗 메소드");
	}
}

package chap08.lecture.p03extends;

public class MyClass1 implements MySubInterface1 {
	
	@Override
	public void superDefaultMethod1() {
		System.out.println("마이클래스에서 재정의한 슈퍼디폴트 메소드");
	}

	@Override
	public void subMethod1() {
		System.out.println("서브 인터페이스 메소드 재정의!");
	}
	
	@Override
	public void superMethod1() {
		System.out.println("슈퍼 인터페이스 메소드 재정의@@");
	}
	
	@Override
	public void superMethod2() {
		System.out.println("슈퍼 인터페이스22 메소드 재정의####");
	}
}

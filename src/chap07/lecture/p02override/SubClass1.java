package chap07.lecture.p02override;

public class SubClass1 extends SuperClass1 {
	
	// 어노테이션 : 컴파일러나, 프레임워크 또는 어떤 프로그램에게 의미있는 정보를 주는 주석
	// 문법 : @어노테이션명
	
	// @Override : 메소드 앞에 작성 가능함
    //	           컴파일러에게 이 메소드가 재정의된 메소드인지 검증하도록 함
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}
	
	@Override
	public void method2() {
		// @Override 어노테이션이 붙어서
		// 컴파일러 재정의한 메소드인지 확인했는데
		// 재정의한 메소드가 아니여서 컴파일 오류
	}
}

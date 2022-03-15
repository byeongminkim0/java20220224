package chap07.lecture.p01inheritance;

public class SubClass2 extends SuperClass2 {
	public SubClass2() {
		// 상위 클래스의 생성자 호출
		// 생략해도 자동으로 추가됨
		super(); 
		System.out.println("서브 클래스2 생성자 실행");
	}
}

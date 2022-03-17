package chap08.lecture.p01interface.example_class;

public interface Pet {
	// 인터페이스명 : UpperCamelCase
	// interface 키워드 사용

	void roll(); // public abstract 생략되어 있음
	
	default void sit() {
		// default method:
		// 인터페이스에 정의된 코드블럭이 있는
		// 인스턴스 메소드
		// 모두 public
		
		System.out.println("반려동물이 앉습니다.");
	}
}

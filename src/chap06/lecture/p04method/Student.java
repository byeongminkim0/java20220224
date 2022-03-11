package chap06.lecture.p04method;

public class Student {
	String name;
	
	Student(String name) {
		this.name = name;
	}
	
	// (instance) method : 이 클래스에 의해 만들어지는 인스턴스(객체)의 기능(행동,action)
	// 작성법
	// 리턴타입 메소드명(파라미터타입 파라미터명...) { 명령문...}
	void study() {
		// 실행할 명령문들...
		System.out.println(name + "이(가)");
		System.out.println("공부합니다.");
	}
}

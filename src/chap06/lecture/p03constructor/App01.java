package chap06.lecture.p03constructor;

public class App01 {
	public static void main(String[] args) {
		/*
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "jin";
		s2.name = "winter";
		
		s1.number = 1;
		s2.number = 2;
		*/
		// 생성자는 new 연산자와 함께 사용해서 instance를 만듬
		// 생성자의 주요 코드는 '필드 초기화'
		Student s1 = new Student("jin", 1);
		Student s2 = new Student("winter", 2);
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1.number);
		System.out.println(s2.number);
	}
}

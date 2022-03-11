package chap06.lecture.p04method;

public class App01 {
	public static void main(String[] args) {
		Student s1 = new Student("winter");
		Student s2 = new Student("spring");
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		s1.study();
		s2.study();
	}
}

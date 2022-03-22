package chap11.lecture.p02class;

public class App01 {
	public static void main(String[] args) throws Exception {
		// 클래스 인스턴스를 얻는 3가지 방법
		Class c1 = String.class; // class 키워드 사용
		Class c2 = Class.forName("java.lang.String"); // forName 메소드 사용
		
		String s1 = "java";
		Class c3 = s1.getClass(); // getClass 인스턴스 메소드 사용
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		
		// 클래스의 이름
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		
		// 메소드 정보 얻기
		System.out.println(c1.getMethods());
		System.out.println("String 메소드 수 : " + c1.getMethods().length);
		
		// 필드 정보 얻기
		System.out.println(c1.getFields());
		System.out.println("String 필드 수 : " + c1.getFields().length);
		
		// 생성자 정보 얻기
		System.out.println(c1.getConstructors());
		System.out.println("String 생성자 수 : " + c1.getConstructors().length);
	}
}

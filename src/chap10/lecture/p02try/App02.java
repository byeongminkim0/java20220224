package chap10.lecture.p02try;

public class App02 {
	public static void main(String[] args) {
		String s = "java";
		String t = "spring";
		
		System.out.println(s.length());
		
		try {
			
			System.out.println(t.length()); // 익셉션 발생안함
			System.out.println("트라이블럭 계속~");
			
		} catch (NullPointerException e) {
			System.out.println("익셉션 발생!!");
		}
		
		System.out.println("프로그램 실행 계속");
	}
}

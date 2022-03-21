package chap10.lecture.p02try;

public class App11 {
	public static void main(String[] args) {
		
		try {
			System.out.println("어떤 코드");
		} finally {
			System.out.println("무조건 실행되는 코드");
		}
		
		System.out.println("실행계속...");
	}
}

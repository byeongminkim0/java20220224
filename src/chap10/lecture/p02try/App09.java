package chap10.lecture.p02try;

public class App09 {
	public static void main(String[] args) {
		// finally : 예외가 발생여부 관계없이 항상 실행되는 코드블럭
		
//		String s = null;
		String s = "java";
		
		try {
			System.out.println(s.length());
			
			System.out.println("try block 실행계속.....");
		} catch (NullPointerException e) {
			System.out.println("널포인터익셉션 발생");
//			e.printStackTrace();
		}finally {
			// 마지막에 작성
			System.out.println("항상 실행되는 finally block");
		}
		
		System.out.println("프로그램 실행 계속....");
	}
}

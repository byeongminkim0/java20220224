package chap10.lecture.p05message;

public class App03 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static void method1() throws Exception {
		throw new Exception("사용자 메시지!@!@!@!@");
	}
}

package chap10.lecture.p02try;

public class App08 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 0};

		try {
			int r = arr1[0] / arr1[1];

			System.out.println(r);
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("아리스메틱익셉션 또는 널포인터익셉션 발생");
			System.out.println(e.getMessage());
			System.out.println(e instanceof ArithmeticException);
			System.out.println(e instanceof NullPointerException);
			e.printStackTrace(); // 익셉션객체의 타입, 메세지, 발생된 코드
			                     // catch 블럭에 꼭 작성
		}
		// catch 블럭 여러개 작성시
		// 하위타입보다 상위타입을 아래에 작성

		System.out.println("프로그램 실행 계속");
	}
}

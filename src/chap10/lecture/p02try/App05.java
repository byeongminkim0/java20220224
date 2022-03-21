package chap10.lecture.p02try;

public class App05 {
	public static void main(String[] args) {
		int[] arr1 = null;

		try {
			int r = arr1[0] / arr1[2];

			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println("아리스메틱익셉션 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아웃오브바운즈익셉션 발생");
		} catch (RuntimeException e) {
			System.out.println("널포인터익셉션 발생");
		}
		// catch 블럭 여러개 작성시
		// 하위타입보다 상위타입을 아래에 작성
		

		System.out.println("프로그램 실행 계속");
	}
}

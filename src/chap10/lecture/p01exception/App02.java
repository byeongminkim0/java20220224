package chap10.lecture.p01exception;

public class App02 {
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		
		int[] arr1 = new int[] {5, 6, 7};
		System.out.println(arr1[0]);
		System.out.println(arr1[2]);
		
//		System.out.println(arr1[-1]); // Exception 발생
		System.out.println(arr1[3]); // Exception
		
		
		System.out.println("프로그램 계속 실행");
	}
}	

package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		int i; // 변수를 for 문 종료 후에도 사용하기 원할 때 for문 이전에 변수 선언
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println(i); // xxx
	}
}

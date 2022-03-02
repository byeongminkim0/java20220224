package chap04.lecture.forloop;

public class C01For {
	public static void main(String[] args) {
		System.out.println("stmt 1");
		
		
		// 괄호() 안 : 3개의 명령문 작성
		// 1번 : 초기값 
		// 2번 : 조건
		// 4번 : 증감
		
		// 3번 : 코드블럭
		
		// 실행순서 : 1번 -> 2번 true -> 3번 -> 4번 -> 2번
		//                      false -> 다음 실행 흐름
		
		for (int i = 0; i < 3; i++) {
			System.out.println("stmt 2");
			System.out.println("stmt 3");
		}
		
		System.out.println("stmt 4");
	}
}





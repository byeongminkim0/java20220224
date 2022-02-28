package chap03.lecture.ternary;

public class C01Ternary {
	public static void main(String[] args) {
		
		// 삼항연산자
		// 1번항 ? 2번항 : 3번항
		// 연산결과: 2번항 또는 3번항
		//      1번항이 true이면 2번항
		//             false이면 3번항
		
		int i = true ? 1 : 2;
		System.out.println(i);
		
		int j = false ? 1 : 2;
		System.out.println(j);
		
		
		System.out.println(true ? "가" : "나");
		System.out.println(false ? "다" : "라");
		
		int k = 3;
		
		System.out.println((k != 3) ? "마" : "바");
	}
}









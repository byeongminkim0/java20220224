package chap04.lecture.ifelse;

public class C04Random {
	public static void main(String[] args) {
		// 1 ~ 10 의 임의의 자연수
		System.out.println("1~10 임의의 자연수");
		double n1 = Math.random(); // 0.0 <= n < 1.0
		System.out.println(n1);
		
		double n2 = n1 * 10;
		System.out.println(n2);
		
		int n3 = (int) n2;
		System.out.println(n3);
		
		int n4 = n3 + 1;
		System.out.println(n4);
		
		// 주사위
		System.out.println("주사위");
		System.out.println(((int) (Math.random()*6)) + 1);
		
		// 로또 (1~45)번호
		System.out.println("로또");
		System.out.println(((int) (Math.random()*45)) + 1); // 코드작성
	}
}










package chap03.lecture.binary;

public class C01Arithmetic {
	public static void main(String[] args) {
		// 산술연산자
		// +, -, *, /, %
		
		// 피연산자 2개
		// 피연산자의 type에 따라서 결과값의 타입이 정해짐
		
		int n1 = 3;
		int n2 = 50;
		
		System.out.println(n1 + n2); // 53
		System.out.println(n1 - n2); // -47
		System.out.println(n1 * n2); // 150
		System.out.println(n2 / n1); // 16 <- 주의 
		System.out.println(n2 % n1); // 2
		
		double n3 = 3.14;
		double n4 = 9.1;
		System.out.println(n3 + n4);
		System.out.println(n3 - n4);
		System.out.println(n3 * n4);
		System.out.println(n3 / n4);
		System.out.println(n3 % n4);
		
		System.out.println(n3 + n1);
		System.out.println(n3 - n1);
		System.out.println(n3 * n1);
		System.out.println(n3 / n1);
		System.out.println(n3 % n1);
	}
}










package chap03.lecture.unary;

public class C03LogicalNot {
	public static void main(String[] args) {
		// 논리연산자 not
		// !
		// 피연산자 1개이고 타입은 boolean
		// 연산결과 boolean 타입이고 값은 피연자와 반대
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(!b1); //false
		System.out.println(!b2); // true
		
		boolean b3 = !b1;
		System.out.println(b3); //false
		
		b3 = !b2;
		System.out.println(b3); // true
	}
}





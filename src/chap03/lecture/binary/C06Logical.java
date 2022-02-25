package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		// 논리연산자
		// &&(AND short circuit), ||(OR short circuit)
		// &(AND), |(OR), ^(XOR)
		// 피연산자 : boolean
		// 연산결과 : boolean
		
		// AND &&
		// 양변 모두 true일 때만 true, 나머지 모두 false
		System.out.println("AND &&");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// OR ||
		// 양변 모두 false일 때만 false, 나머지 모두 true
		System.out.println("OR ||");
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// short circuit
		int i = 3;
		System.out.println((i > 0) && (i++ > 0));
		System.out.println(i);
		
		System.out.println((i < 0) && (i++ < 0)); // 단락(short circuit)
		System.out.println(i);
		
		System.out.println((i < 0) || (i++ < 0));
		System.out.println(i);
		
		System.out.println((i > 0) || (i++ > 0)); // short circuit
		System.out.println(i);
		
		System.out.println((i > 0) & (i++ > 0));
		System.out.println(i);
		
		System.out.println((i < 0) & (i++ < 0)); // short circuit xxxxxx
		System.out.println(i);
		
		// ^ (XOR) 
		// 양변이 다를 때만 true, 같으면 false
		System.out.println("^ (XOR)");
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
	}
}









package chap03.lecture.unary;

public class C02Increment {
	public static void main(String[] args) {
		// 증감연산자
		// 증가 increment ++
		// 감소 decrement --
		
		int i = 7;
		i++; // i = i + 1
		
		System.out.println(i); // 8
		
		i++;
		System.out.println(i); // 9
		
		i--; // i = i - 1
		System.out.println(i); // 8
		i--;
		System.out.println(i); // 7
		
		// 증감연산자 위치 : 피연산자 앞/뒤
		++i; // i = i + 1
		System.out.println(i); // 8
		
		--i; // i = i - 1
		System.out.println(i); // 7
		
		
		System.out.println(i++); // 7
		System.out.println(i); // 8
		
		System.out.println(i--); // 8
		System.out.println(i); // 7
		
		System.out.println(++i); // 8
		System.out.println(i); // 8
		
		System.out.println(--i); // 7
		System.out.println(i); // 7
		
		
		int j = i++;
		int k = ++i;
		
		System.out.println(j);
		System.out.println(k);
		
		int l = i;
		i++;
		
		i++;
		int m = i;
	}
}





















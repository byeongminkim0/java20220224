package chap03.lecture.binary;

public class C07Assignment {
	public static void main(String[] args) {
		// 대입연산자(할당연산자, assignment)
		// =, +=, -=, *=, /=, %=
		
		int i = 100; // 100을 i에 대입
		
		i += 3; // i가 원래 가진 값에 3을 더해서 대입
		        // i = i + 3; 와 같음
		
		System.out.println(i);
		
		i -= 9; // i가 원래 가진 값에 9을 빼서 대입
		        // i = i - 9; 와 같음
		System.out.println(i);
		
		i *= 2; // i가 원래 가진 값에 2 곱해서 대입
		        // i = i * 2; 와 같음
		System.out.println(i);
		
		i /= 3; // i가 원래 가진 값에 3 나눈 몫을 대입
		        // i = i / 3; 와 같음
		System.out.println(i);
		
		i %= 3; // i가 원래 가진 값에 3으로 나눈 나머지를 대입
		        // i = i % 3;
		System.out.println(i);
		
		int j, k, l;
		
		j = k = l = i; // 오른쪽부터 연산
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}







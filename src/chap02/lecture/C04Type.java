package chap02.lecture;

public class C04Type {
	public static void main(String[] args) {
		
		double v1 = 3.14;
//		int v2 = 3.14; // x
		
		// 데이터 타입(자료형)
		// 기본타입(primitive) 8개
		// 정수
		// byte, short, int, long
		
		// 실수
		// float, double
		
		// 논리
		// boolean
		
		// 문자(정수)
		// char
		
		// 참조형 (reference type) 위 8개 빼고 다
		// 챕터5에서 설명
		
		//////////////////////////////////////////
		
		// 정수 (byte(1), short(2), int(4), long(8))
		int var1 = 30;
		int var2 = Integer.MAX_VALUE;
		System.out.println(var2);
		int var4 = Integer.MIN_VALUE;
		System.out.println(var4);
		
		int var3 = 2147483647; // 최대값
		int var5 = -2147483648; // 최소값
		System.out.println(var3);
		System.out.println(var5);
		
//		short var6 = 2147483647; // x
		System.out.println(Short.MAX_VALUE);
		short var7 = 32767; // 최대값
		System.out.println(Short.MIN_VALUE);
		short var8 = -32768; // 최소값
		
		byte var9 = 127; // 최대값
		byte var10 = -128; // 최소값
		
		System.out.println(var9); // 127
		byte var11 = (byte) (var9 + 1);
		System.out.println(var11); // -128
		
		System.out.println(var3 + 1); // overflow
		
		long var12 = 923874927;
		System.out.println(Long.MAX_VALUE);
		long var13 = 9223372036854775807L; // 최대값
		System.out.println(Long.MIN_VALUE);
		long var14 = -9223372036854775808L; // 최소값
		
		System.out.println(2147483647);
		System.out.println(2147483648L); // integer 범위보다 큰 literal은 끝에 L(l)붙여야함
		
		// 큰 정수 사용시 _ 조합 가능
		int var15 = 21_3876_1234;
		int var16 = 2_138_761_234;
	}
}




















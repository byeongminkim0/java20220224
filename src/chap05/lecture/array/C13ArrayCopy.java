package chap05.lecture.array;

import java.util.Arrays;

public class C13ArrayCopy {
	public static void main(String[] args) {
		int[][] a = { { 3, 5 }, { 10, 11, 12 }, { 20, 10 } };
		int[][] b = a;
		
		b[0][0] = 99;
		System.out.println(a[0][0]);
		
		int[][] c = Arrays.copyOf(a, a.length);
		System.out.println(c[0][0]);
		
		c[0][0] = 999;
		System.out.println(c[0][0]);// 999
		System.out.println(a[0][0]);// 99? 999?
		
		c[0] = new int[] {22, 23};
		System.out.println(c[0][0]);// 22
		System.out.println(a[0][0]);// 22? 999?
	}
}





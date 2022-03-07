package chap05.lecture.array;

import java.util.Arrays;

public class C14ArrayCopy {
	public static void main(String[] args) {
		int[][] a = { { 3, 5 }, { 10, 11, 12 }, { 20, 10 } };
		
		int[][] b = Arrays.copyOf(a, a.length);
		b[0][0] = 99;
		System.out.println(a[0][0]);
		
		int[][] c = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			c[i] = Arrays.copyOf(a[i], a[i].length);
		}
		
		c[0][0] = 999;
		System.out.println(a[0][0]);// 99;
	}
}






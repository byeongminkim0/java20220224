package chap05.lecture.array;

import java.util.Arrays;

public class C15ArrayCopy {
	public static void main(String[] args) {
		int[][] a = {{9, 10}, {3, 4}};
		int[][] b = Arrays.copyOf(a, a.length);
		b[0][0] = 999;
		
		int[][] c = new int[a.length][];
		
		/*
		c[0] = Arrays.copyOf(a[0], a[0].length);
		c[1] = Arrays.copyOf(a[1], a[1].length);
		*/
		for(int i=0;i<a.length;i++) {
			c[i] = Arrays.copyOf(a[i], a[i].length);
		}
		c[0][0] = 9999;
		
		System.out.println(a[0][0]);
		System.out.println(c[0][0]);
		System.out.println(c[1][1]);
	}
}

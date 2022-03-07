package chap05.lecture.array;

public class C08Array {
	public static void main(String[] args) {
		int[][] a = { { 0, -1 }, { 9, 2 }, { 3 } };
		method1(a);
		
		System.out.println(a[0][0]); // 10000
	}
	
	public static void method1(int[][] p) {
		p[0][0] = 10000;
	}
}

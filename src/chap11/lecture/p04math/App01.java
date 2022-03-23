package chap11.lecture.p04math;

public class App01 {
	public static void main(String[] args) {
		// 반올림
		long l1 = Math.round(3.14);
		System.out.println(l1);
		
		// 올림
		double d1 = Math.ceil(3.14);
		System.out.println(d1);
		
		// 내림
		double d2 = Math.floor(3.14);
		System.out.println(d2);
		
		// 절대값
		int i1 = Math.abs(-5);
		System.out.println(i1);
		
		// 비교 max
		int i2 = Math.max(3, 10);
		System.out.println(i2);
		
		// 비교 min
		int i3 = Math.min(3, 10);
		System.out.println(i3);
		
		// 임의의 값 (0.0보다 크거나 같고 1보다 작은 값)
		System.out.println(Math.random());
	}
}







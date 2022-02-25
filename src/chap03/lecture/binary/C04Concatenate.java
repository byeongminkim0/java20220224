package chap03.lecture.binary;

public class C04Concatenate {
	public static void main(String[] args) {
		// +의 피연산자가 하나라도 String이면 연결연산자
		
		String s1 = "hello";
		String s2 = "java";
		
		System.out.println(s1 + s2);
		
		String s3 = s1 + s2;
		System.out.println(s3);
		
		int i1 = 9999;
		int i2 = 8888;
		
		System.out.println(i1 + i2);
		System.out.println(i1 + s1);
		
		String s4 = "8888";
		System.out.println(i1 + s4);
		
		System.out.println(i1 + i2 + s1);
		System.out.println(s1 + i1 + i2);
	}
}











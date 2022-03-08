package chap05.lecture.string;

public class C02String {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = new String("hello");
		
		String s3 = "java";
		String s4 = "hello";
		
		System.out.println(s1.length()); // 4
		System.out.println(s2.length()); // 5
		System.out.println(s3.length()); // 4
		System.out.println(s4.length()); // 5
	}
}

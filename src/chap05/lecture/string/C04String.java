package chap05.lecture.string;

public class C04String {
	public static void main(String[] args) {
		// char + String 
		char c1 = '가';
		String s1 = "나";
		
		String s2 = c1 + s1;
		System.out.println(s2);
		
		// char + char
		char c2 = 'a';
		char c3 = 'b';
		
		int i = c2 + c3;
		System.out.println(i);
	}
}

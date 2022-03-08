package chap05.lecture.string;

public class C05String {
	public static void main(String[] args) {
		// replaceAll(regex, replacement)
		// 첫번째 파라미터 패턴에 맞는 스트링을
		// replacement(두번째파라미터)로 변경
		
		String s1 = "java1234Script";
		String s2 = s1.replaceAll("a", "z");
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = s1.replaceAll("[0-9]", "*");
		System.out.println(s3);
		String s4 = s1.replaceAll("[a-zA-Z]", "*");
		System.out.println(s4);
	}
}

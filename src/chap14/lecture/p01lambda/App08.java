package chap14.lecture.p01lambda;

import java.util.ArrayList;

public class App08 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("java");
		list1.add("spring");
		list1.add("hello");
		list1.add("jsp");
		list1.add("friday");
		
		list1.forEach(e -> System.out.println(e));
		
		// 절반의 문자열 출력
		for (String s : list1) {
			System.out.println(s.substring(0, s.length()/2));
		}
		
		list1.forEach(e -> System.out.println(e.substring(0, e.length()/2)));
	}
}






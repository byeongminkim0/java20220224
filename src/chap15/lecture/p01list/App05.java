package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App05 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
		list1.add("spring");
		list1.add("jsp");
		list1.add("vue");
		
		// 크기
		int length = list1.size();
		System.out.println(length);
		
		// 비어있는지?
		boolean empty = list1.isEmpty();
		System.out.println(empty);
		
		// 모두 지우기
		list1.clear();
		System.out.println(list1.size()); // 0
		System.out.println(list1.isEmpty()); // true
		
	}
}

package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App10 {
	public static void main(String[] args) {
		List<List<String>> list = new ArrayList<List<String>>();
		list.add(new ArrayList<String>());
		list.add(new ArrayList<String>());
		list.add(new ArrayList<>());
		
		list.get(0).add("java");
		list.get(0).add("spring");
		list.get(1).add("jimin");
		list.get(1).add("rm");
		list.get(1).add("jin");
		list.get(2).add("spring");
		list.get(2).add("summer");
		
		System.out.println(list);
	}
}

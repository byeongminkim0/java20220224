package chap15.lecture.p01list;

import java.util.ArrayList;

public class App02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(2);
		
		// 최대값, 최소값
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<list.size(); i++) {
//			max = Math.max(list.get(i), max);
			max = list.get(i) > max ? list.get(i) : max;
			min = Math.min(list.get(i), min);
		}
		
		System.out.println(max);
		System.out.println(min);
		
		// 향상된 for
		for(Integer e : list) {
			max = Math.max(e, max);
			min = Math.min(e, min);
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}

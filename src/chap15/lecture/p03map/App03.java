package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class App03 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		map.compute(3, (k, v) -> 100);
		
		System.out.println(map.size());
		
		map.compute(4, (k, v) -> {
			System.out.println(k);
			System.out.println(v);
			
			return 0;
		});
		
		System.out.println(map.size());
		System.out.println(map);
		
		Map<Integer, Integer> map2 = new HashMap<>();
		int[] nums = {9, 8, 7, 7};
		/*
		map2.compute(9, (k, v) -> v == null ? 1 : v + 1);
		map2.compute(8, (k, v) -> v == null ? 1 : v + 1);
		map2.compute(7, (k, v) -> v == null ? 1 : v + 1);
		map2.compute(7, (k, v) -> v == null ? 1 : v + 1);
		*/
		for (int num : nums) {
			map2.compute(num, (k, v) -> v == null ? 1 : v + 1);
		}
		
		System.out.println(map2);
	}
}








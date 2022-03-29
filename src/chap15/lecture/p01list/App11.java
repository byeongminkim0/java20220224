package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App11 {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(95, 86));
		list.add(Arrays.asList(83, 92, 96));
		list.add(Arrays.asList(78, 83, 93, 87, 88));
		
		// 합계(881), 평균(88.1)
		int sum = 0;
		int cnt = 0;
//		for(int i=0;i<list.size();i++) {
//			for(int j = 0;j<list.get(i).size();j++) {
//				sum += list.get(i).get(j);	
//				cnt++;
//			}
//		}
		for(List<Integer> row : list) {
//			System.out.println(row);
			for(Integer score : row) {
//				System.out.println(score);
				sum += score;
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println((double)sum/(double)cnt);
		
	}
}

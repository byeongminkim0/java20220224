package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		// 홀수 element 삭제
//		for(int i=1;i<list.size();i++) {
//			list.remove(i);
//		}
		
		/*
		int i=0;
		while(i<list.size()) {
			Integer elem = list.get(i);
			if(elem%2==1) {
				list.remove(i);
			}
			i++;
		}
		*/
		
//		list.removeIf(e -> (e%2)==1);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			if(iter.next()%2==1) {
				iter.remove();
			}
		}
		
		System.out.println(list);
	}
}

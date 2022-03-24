package chap13.lecture.p01generic;

import java.util.List;

public class App12 {
	// 상하위 타입 그림
	// https://docs.oracle.com/javase/tutorial/java/generics/subtyping.html
	public static void main(String[] args) {
		List<?> list1 = null;
		List<? extends Number> list2 = null;
		List<? extends Integer> list3 = null;
		List<Integer> list4 = null;
		
		List<? super Integer> list5 = null;
		List<? super Number> list6 = null;
		List<Number> list7 = null;
		
//		list7 = list4; //xxx
		
		list1 = list2;
		list1 = list5;
		
		list2 = list3;
		list2 = list7;
		
		list5 = list4;
		list5 = list6;
		
		list3 = list4;
		
		list6 = list7;
		
		
	}
}







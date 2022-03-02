package chap04.lecture.forloop;

public class C05NestedFor {
	public static void main(String[] args) {
		
		System.out.println("연습1");
		for (int j = 0; j < 5; j++) {
			
			for (int i = 0; i < 3; i++) {
				System.out.println(i);
			}
			
		}
		
		// 
		System.out.println("연습2");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + ", " + j);
			}
		}
	}
}






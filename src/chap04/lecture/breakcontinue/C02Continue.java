package chap04.lecture.breakcontinue;

public class C02Continue {

	public static void main(String[] args) {
		
		System.out.println("stmt 1");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("stmt 2");
			if (true) {
				continue;
			}
			System.out.println("stmt 3");
		}
		
		System.out.println("stmt 4");
		
	}
}

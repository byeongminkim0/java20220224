package chap04.lecture.switchcase;

public class C02Switch {
	public static void main(String[] args) {
		System.out.println("stmt 1");
		
		switch (3) {
		case 1:
			System.out.println("stmt 2");
			break;
		case 2:
			System.out.println("stmt 3");
			System.out.println("stmt 4");
			break;
		case 3:
			System.out.println("stmt 5");
			System.out.println("stmt 6");
			break;
		}
		System.out.println("stmt 7");
		System.out.println("stmt 8");
		System.out.println("stmt 9");
	}
}

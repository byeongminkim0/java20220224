package chap04.lecture.switchcase;

public class C03Switch {
	public static void main(String[] args) {
		// default : 일치하는 case가 없을 때 실행
		
		switch (3) {
		case 1:
			System.out.println("stmt 1");
			break;
		case 2:
			System.out.println("stmt 2");
			break;
		default:
			System.out.println("stmt 3");
			break;
		}
	}
}

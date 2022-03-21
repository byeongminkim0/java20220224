package chap10.lecture.p06custom;

public class App01 {
	public static void main(String[] args) {
		try {
			method1(200);
		} catch (ValueOutOfBoundsException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void method1(int value) throws ValueOutOfBoundsException {
		if(value > 100) {
			throw new ValueOutOfBoundsException("value : " + value);
		}
		
		System.out.println("실행 흐름 이어감...");
	}
}

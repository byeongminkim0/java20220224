package chap07.lecture.p05promotion;

public class App01 {
	public static void main(String[] args) {
		SubClass1 o1 = new SubClass1();
		SuperClass1 o2 = o1; // 자동 타입변환
		
		System.out.println(o1 == o2);
		
		SuperClass1 o3= new SubClass1();
	}
}

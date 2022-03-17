package chap08.lecture.p02polymorphism;

public class App01 {
	public static void main(String[] args) {
		// 자동 형변환
		MyClass1 o1 = new MyClass1();
		MyInterface1 i1 = o1; // 자동 형변환
		
		System.out.println(i1 == o1);
		
		MyInterface1 i2 = new MyClass1(); // 자동 형변환
		
		// 메소드 파라미터
		method1(o1); // 자동 형변환
		method1(i1);
		method1(new MyClass1()); // 자동 형변환
		method1(i2);
		
		// 배열
		MyInterface1[] arr1 = new MyInterface1[3];
		arr1[0] = new MyClass1(); // 자동 형변환
		arr1[1] = i1;
		arr1[2] = o1; // 자동 현변환
	}
	
	public static void method1(MyInterface1 param) {
		
	}
	
	public static MyInterface1 method1() {
		MyClass1 o1 = new MyClass1();
		return o1;
	}
}

interface MyInterface1 {
	
}
class MyClass1 implements MyInterface1 {
	
}

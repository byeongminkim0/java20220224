package chap14.lecture.p01lambda;

public class App05 {
	public static void main(String[] args) {
		MyInterface5 o1 = (int a, int b) -> {
			return a + b;
		};
		
		// parameter type 생략
		MyInterface5 o2 = (d, e) -> {
			return d * e;
		};
		
		// 명령문 하나일 때 중괄호 생략
		// 그 명령문이 return 명령문일 때 return 키워드 생략
		MyInterface5 o3 = (d, e) -> d - e;
		
		// 명령문 하나일 때 중괄호 생략
		MyInterface51 o4 = (x) -> System.out.println(x);
		
		// 파라미터가 하나일 때 둥근괄호 생략
		MyInterface51 o5 = x -> System.out.println(x);
	}
}

@FunctionalInterface
interface MyInterface5 {
	int method(int x, int y);
}

@FunctionalInterface
interface MyInterface51 {
	void method(int x);
	
}






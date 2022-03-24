package chap13.lecture.p01generic;

public class App07 {

}

interface MyInterface7<T> {
	public void method(T param);
}

// generic type 상속(또는 구현)시 하위 클래스도 generic type
class MyClass1<T> implements MyInterface7<T> {
	@Override
	public void method(T param) {
		// TODO Auto-generated method stub
		
	}
}

// 하위 클래스에 type parameter 추가 가능
class MyClass2<T,U> implements MyInterface7<T> {
	@Override
	public void method(T param) {
		// TODO Auto-generated method stub
		
	}
}

// 결정된 상위타입을 구현(또는 상속) 할 수 있음
class MyClass3 implements MyInterface7<String> {
	@Override
	public void method(String param) {
		// TODO Auto-generated method stub
		
	}
}
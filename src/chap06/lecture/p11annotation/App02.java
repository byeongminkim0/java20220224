package chap06.lecture.p11annotation;

import java.lang.reflect.Method;

public class App02 {
	public static void main(String[] args) throws Exception {
		Class c1 = MyClass2.class;
		
		Method m1 = c1.getDeclaredMethod("method1");
		Method m2 = c1.getDeclaredMethod("method2");
		
		System.out.println(m1.isAnnotationPresent(MyAnnotation2.class));
		System.out.println(m2.isAnnotationPresent(MyAnnotation2.class));
	}
}

class MyClass2 {
	
	void method1() {
		
	}
	
	@MyAnnotation2
	void method2() {
		
	}
}

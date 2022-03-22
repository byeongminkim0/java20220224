package chap06.lecture.p11annotation;

import java.lang.reflect.Method;

public class App01 {
	public static void main(String[] args) throws Exception {
		Class c1 = MyClass.class;
		
		Method method = c1.getDeclaredMethod("method2");
		System.out.println(method.getName());
		System.out.println(method.getAnnotations().length);
		System.out.println(method.isAnnotationPresent(MyAnnotation1.class));
	}
}

@MyAnnotation1
class MyClass {
	
	@MyAnnotation1
	private String name;
	
	@MyAnnotation1
	MyClass() {
		
	}
	
	@MyAnnotation1
	void method(@MyAnnotation1 int param) {
		@MyAnnotation1
		int i;
	}
	
	@MyAnnotation1
	void method2() {
		
	}
}

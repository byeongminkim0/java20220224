package chap07.book.exercise.p08;

public class Exercise08 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new D();
		B b3 = new E();
//		B b4 = (B) new A(); // xxx
		
		method(new B());
		method(new D());
		method(new E());
//		method((B) new A()); // xxx
		
		A a1 = new D();
		method((B) a1); // 
		
		System.out.println("명령문 계속 진행....");
	}
	
	public static void method(B b) {
		
	}
}

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends B {}
class F extends C {}

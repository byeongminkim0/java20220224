package chap07.lecture.p03protected.package1;

public class OtherClass {
	public void someMethod() {
		SuperClass1 o1 = new SuperClass1();
		o1.publicMethod();
		o1.protectedMethod();
		o1.defaultMethod();
	}
}

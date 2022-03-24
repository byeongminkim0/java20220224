package chap13.lecture.p01generic;

public class App14 {
	public static void main(String[] args) {
		App14.<String>method("java"); 
		method("java");
		
		String s1 = App14.<String>method2();
		String s2 = method2();
		
		String s3 = App14.<String>method3("java");
		String s4 = method3("java");
		
	}
	
	// method에 type parameter를 리턴 타입 전에 추가
	// generic method
	
	public static <T> void method(T param) {
		
	}
	
	public static <T> T method2() {
		return null;
	}
	
	public static <T> T method3(T param) {
		return null;
	}
}

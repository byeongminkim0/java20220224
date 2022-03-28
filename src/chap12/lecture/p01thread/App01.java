package chap12.lecture.p01thread;

public class App01 {
	public static void main(String[] args) {
		// 쓰레드 실행 방법
		// Thread 객체 생성 후 start 메소드 실행
		Thread t1 = new Thread();
		t1.start();
		
		Thread t2 = new Thread();
		t2.start();
	}
}

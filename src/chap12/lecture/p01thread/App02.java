package chap12.lecture.p01thread;

public class App02 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		t1.start();
		
		// .. 메인 메소드 계속 실행...
		for(int i=0;i<10000;i++) {
			System.out.println("메인 쓰레드 계속 실행!!!");
		}
	}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("thread1 실행 중...");
		}
	}
}
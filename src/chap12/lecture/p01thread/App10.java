package chap12.lecture.p01thread;

public class App10 {
	public static void main(String[] args) {
		// Thread 실행 2가지
		// 1. Thread 클래스 상속
		Thread t1 = new MyThread1();
		t1.start();
		
		// 2. Runnable 인터페이스 구현
		Runnable r1 = new MyThread102();
		Thread t2 = new Thread(r1);
		t2.start();
	}
}

class MyThread101 extends Thread {
	@Override
	public void run() {
		System.out.println("쓰레드 101이 할 일....");
	}
}

class MyThread102 implements Runnable {
	@Override
	public void run() {
		System.out.println("쓰레드 102가 할 일....");
	}
}
package chap12.lecture.p01thread;

import java.awt.Toolkit;

public class App11 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread111());
		Thread t2 = new Thread(new MyThread112());
		t1.start();
		t2.start();
		
		System.out.println("메인 쓰레드 계속 실행.....");
		
	}
}

class MyThread111 implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<5;i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread112 implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("띠링");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
package chap12.lecture.p01thread;

public class App07 {
	public static void main(String[] args) {
		Thread t1 = new MyThread71();
		Thread t2 = new MyThread72();
		t1.start();
		t2.start();
	}
}

class MyThread71 extends Thread {
	@Override
	public void run() {
		int localVar = 0;
		for(int i=0;i<10000;i++) {
			localVar++;
		}
		System.out.println("thread71 : " + localVar);
	}
}

class MyThread72 extends Thread {
	@Override
	public void run() {
		int localVar = 0;
		for(int i=0;i<10000;i++) {
			localVar++;
		}
		System.out.println("thread72 : " + localVar);
	}
}
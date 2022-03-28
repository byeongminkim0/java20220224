package chap12.lecture.p01thread;

public class App03 {
	public static void main(String[] args) {
		Thread t1 = new MyThread31();
		Thread t2 = new MyThread32();
		t1.start();
		t2.start();
		
		for(int i=0;i<10000;i++) {
			System.out.println("**********************");
		}
	}
}

class MyThread31 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}

class MyThread32 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("########################");
		}
	}
}
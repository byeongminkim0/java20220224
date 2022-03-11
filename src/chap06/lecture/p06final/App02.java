package chap06.lecture.p06final;

public class App02 {
	int i = 3;
	final int j = 5;
	final int k;
	
	App02() {
		k = 30;
	}
	
	public static void main(String[] args) {
		App02 o1 = new App02();
		System.out.println(o1.i);
		o1.i = 4;
//		o1.j = 6;  // xxx
//		o1.k = 60; // xxx
		System.out.println(o1.i);
		
	}

}

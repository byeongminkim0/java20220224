package chap06.lecture.p04method;

public class App02 {
	public static void main(String[] args) {
		// Worker 클래스의 인스턴스 2개 만들고
		// work() 메소드를 실행시켜보세요.
		Worker w1 = new Worker("lee");
		w1.work();
		
		Worker w2 = new Worker("kim");
		w2.work();
	}
}

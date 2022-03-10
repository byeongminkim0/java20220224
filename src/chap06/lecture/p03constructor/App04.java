package chap06.lecture.p03constructor;

public class App04 {
	public static void main(String[] args) {
		Star s1 = new Star(3);
		System.out.println(s1.stars);
		
		Star s2 = new Star(10);
		System.out.println(s2.stars);
		
		Star s3 = new Star("#", 10);
		System.out.println(s3.stars);
	}
}

package chap06.lecture.p03constructor;

public class App02 {
	public static void main(String[] args) {
		Desk d1 = new Desk();
		Desk d2 = new Desk();
		
		System.out.println(d1.weight);
		System.out.println(d1.color);
		
		System.out.println(d2.weight);
		System.out.println(d2.color);
		
		Desk d3 = new Desk(2000, "red");
		Desk d4 = new Desk(3000, "blue");
		System.out.println(d3.weight);
		System.out.println(d3.color);
		System.out.println(d4.weight);
		System.out.println(d4.color);
	}
}

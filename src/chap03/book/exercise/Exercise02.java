package chap03.book.exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		
		System.out.println(z);
		System.out.println(x); // 11
		System.out.println(y); // 19
	}
}

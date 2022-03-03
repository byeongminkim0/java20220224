package chap04.lecture.scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String str = "3 4 33 88";
		
		Scanner scanner = new Scanner(str);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println(num1 + num2 + num3 + num4);
		
		scanner.close();
	}
}

package chap07.lecture.p05promotion;

import java.util.Scanner;

public class App07 {
	public static void main(String[] args) {
		String str1 = "java";
		Object o1 = str1;
		Object o2 = "spring";
		Object o3 = new String("hello");
		
		Scanner scanner = new Scanner(System.in);
		Object o4 = scanner;
		Object o5 = new Scanner("");
	}
}

package chap08.lecture.p02polymorphism;


import java.io.Closeable;
import java.io.Serializable;
import java.util.Scanner;

public class App02 {
	public static void main(String[] args) {
		String str = "java";
		Object o1 = str; // 자동 형변환
		Serializable s1 = str; // 자동 형변환
		CharSequence c1 = str; // 자동 형변환
		Comparable<String> com1 = str; // 자동 형변환
		
		Serializable s2 = "spring"; // 자동 형변환
		CharSequence c2 = "hello"; // 자동 형변환
		Comparable<String> com2 = "jsp"; // 자동 형변환
		
		//Scanner
		Scanner scanner = new Scanner("");
		Object o2 = scanner;
		Closeable cl = scanner;
		AutoCloseable ac = scanner;
		
	}
}

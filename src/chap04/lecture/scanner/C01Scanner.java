package chap04.lecture.scanner;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		// 키보드 입력 준비
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		String line = scanner.nextLine(); // 키보드로 입력한 값을 enter를 만날 때까지의 문자열로 리턴
		
		System.out.println(line);
		
		// 스캐너 닫기
		scanner.close();
	}
}

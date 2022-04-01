package chap18.lecture.p05file;

import java.io.File;

public class App01 {
	public static void main(String[] args) {
		// File : file관련 기능이 있는 클래스
		String path = "src/chap18/lecture/p05file/App01.java";
		File file = new File(path);
		
		// exists : file이 존재하는가
		System.out.println(file.exists());
		
		//  isDirectory : directory 인가?
		System.out.println(file.isDirectory());
		
		// isFile : file 인가?
		System.out.println(file.isFile());
		
		// length : file 크기
		System.out.println(file.length());
	}
}

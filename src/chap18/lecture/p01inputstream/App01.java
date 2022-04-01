package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class App01 {
	public static void main(String[] args) throws Exception {
		String fileName = "src/chap18/lecture/p01inputstream/App01.java";
		
		// InputStream : 데이터 입력 처리 클래스
		InputStream is = new FileInputStream(fileName);
		
		// read : 한바이트 읽는 메소드
		int byte1 = is.read();
		int byte2 = is.read();
		int byte3 = is.read();
		
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
	}
}

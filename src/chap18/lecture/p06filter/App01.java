//한글추가
package chap18.lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;

public class App01 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p06filter/App01.java";
		InputStream is = new FileInputStream(path);
		
		int b1 = is.read();
		int b2 = is.read();
		int b3 = is.read();
		int b4 = is.read();
		
		System.out.println((char) b1);
		System.out.println((char) b2);
		System.out.println((char) b3);
		System.out.println((char) b4);
		
		is.close();
	}
}

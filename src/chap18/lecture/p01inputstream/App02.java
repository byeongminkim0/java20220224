package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class App02 {
	public static void main(String[] args) throws Exception {
		
		String path = "src/chap18/lecture/p01inputstream/App02.java";
		
		InputStream is = new FileInputStream(path);
		
		int read = 0;
		int cnt = 0;
		while((read = is.read()) != -1) {
//			System.out.println(read);
			cnt++;
		}
		
		System.out.println(cnt);
	}
}

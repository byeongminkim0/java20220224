package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App07 {
	public static void main(String[] args) throws Exception {
		String src = "output/FilterExample51.txt";
		InputStream is = new FileInputStream(src);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		int data = 0;
		while((data = br.read()) != -1) {
			System.out.println("파일 읽는 중....");
		}
		
		br.close();
		isr.close();
		is.close();
	}
}

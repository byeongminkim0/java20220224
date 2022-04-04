//한글추가
package chap18.lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class App02 {
	public static void main(String[] args) throws Exception {
		String file = "src/chap18/lecture/p06filter/App02.java";
		InputStream is = getInputStream(file);
		Reader isr = new InputStreamReader(is);
		
		int data1 = isr.read();
		int data2 = isr.read();
		int data3 = isr.read();
		int data4 = isr.read();
		
		System.out.println((char) data1);
		System.out.println((char) data2);
		System.out.println((char) data3);
		System.out.println((char) data4);
	}
	
	private static InputStream getInputStream(String fileName) throws Exception {
		InputStream is = new FileInputStream(fileName);
		
		return is;
	}
}

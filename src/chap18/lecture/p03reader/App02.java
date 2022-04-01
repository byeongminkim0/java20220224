package chap18.lecture.p03reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class App02 {
	public static void main(String[] args) throws Exception {
		String name = "src/chap18/lecture/p03reader/App02.java";
		
		Reader rd = new FileReader(name);
		
		int data = 0;
		
		while((data = rd.read()) != -1) {
			System.out.print((char)data);
		}
		
		rd.close();
	}
}

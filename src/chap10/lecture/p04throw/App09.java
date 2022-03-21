package chap10.lecture.p04throw;

import java.io.FileReader;

public class App09 {
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	private static void method1() throws Exception {
		FileReader fr = new FileReader(""); // FileNotFoundException
		fr.read(); // IOException
		
		Class.forName(""); // ClassNotFoundException
	}
}

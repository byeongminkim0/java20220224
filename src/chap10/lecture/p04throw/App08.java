package chap10.lecture.p04throw;

import java.io.FileReader;
import java.io.IOException;

public class App08 {
	public static void main(String[] args) throws IOException {
			method1();
	}
	
	private static void method1() throws IOException {
		FileReader fr = new FileReader("");
		fr.read();
	}
}

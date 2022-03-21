package chap10.lecture.p04throw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App07 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
			method1();
	}
	
	private static void method1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("");
		fr.read();
	}
}

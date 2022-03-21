package chap10.lecture.p04throw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App06 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("");
		fr.read();
	}
}

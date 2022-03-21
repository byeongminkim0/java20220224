package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App03 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

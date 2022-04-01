package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App04 {
	public static void main(String[] args) {
		
		String inputFile = "picture/다형성01.png";
		String outputFile = "output/다형성01.png";
		
		try(InputStream is = new FileInputStream(inputFile);
				OutputStream os = new FileOutputStream(outputFile);) {
			
			int data = 0;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!!!");
	}
}

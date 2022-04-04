package chap18.lecture.p06filter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App04 {
	public static void main(String[] args) throws Exception {
		String path = "output/FileterStream04.txt";
		OutputStream os = new FileOutputStream(path);
		Writer writer = new OutputStreamWriter(os);
		
//		os.write('a');
//		os.write('한');
		writer.write('b');
		writer.write('글');
		
		writer.close();
		os.close();
	}
}

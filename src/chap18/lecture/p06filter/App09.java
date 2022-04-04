package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileReader;

public class App09 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p06filter/App09.java";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
			
		br.close();
		fr.close();
	}
}

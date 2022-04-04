package chap18.lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App08 {
	public static void main(String[] args) throws Exception {
		String out = "output/FilterExample8.txt";
		OutputStream os = new FileOutputStream(out);
		// OutputStreamReader문자단위출력스트림으로 변환
		Writer osw = new OutputStreamWriter(os);
		// BufferedWriter로 변환
		Writer bw = new BufferedWriter(osw);
		
		// 천만개의 문자 파일에 쓰는 코드 작성
		for(int i = 0; i<1000_0000; i++) {
			bw.write('한');
		}
		
		// 스트림 닫기
		bw.close();
		osw.close();
		os.close();
		
		System.out.println("종료!");
	}
}

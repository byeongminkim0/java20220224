package chap18.lecture.p04writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App03 {
	public static void main(String[] args) throws Exception {
		// 그림 파일 복사
		// Reader, Writer 사용 하지 마세요.
		
		String origin = "picture/다형성01.png"; // 원본
		String copy = "output/다형성01_copy.png"; // 복사본
		
		Reader rd = new FileReader(origin);
		Writer wr = new FileWriter(copy);
		
		int data = 0;
		
		while((data = rd.read()) != -1) {
			wr.write(data);
		}
		
		wr.flush();
		wr.close();
		rd.close();
		System.out.println("복사 완료!");
	}
}

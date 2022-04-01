package chap18.lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class App07 {
	public static void main(String[] args) throws Exception {
		// 원본 파일 : "picture/참조타입01.png"
		// 복사 파일 : "output/참조타입01_copy.png"
		
		String in = "picture/참조타입01.png";
		String out = "output/참조타입01_copy.png";
		
		InputStream is = new FileInputStream(in);
		OutputStream os = new FileOutputStream(out);
		
		byte[] datas = new byte[100];
		int len = 0;
		
		while((len = is.read(datas)) != -1) {
			os.write(datas, 0, len);
		}
		
		os.close();
		is.close();
		
		System.out.println("프로그램 종료!"); 
	}
}

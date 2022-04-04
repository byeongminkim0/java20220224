package chap18.lecture.p07network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class App03Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("192.168.0.102", 38080));
		
		System.out.println("[서버와 연결 성공]");
		System.out.println("[서버로 파일 보내기 시작]");
		
		String path = "picture/참조타입04.png";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		OutputStream os = socket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		byte[] datas = new byte[1024];
		int len = 0;
		
		while((len = bis.read(datas)) != -1) {
			bos.write(datas, 0, len);
		}
		
		System.out.println("[서버로 파일 전송 종료]");
		System.out.println("클라이언트 프로그램 종료");
		
		bos.close();
		os.close();
		bis.close();
		fis.close();
		socket.close();
	}
}

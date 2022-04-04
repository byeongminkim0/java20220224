package chap18.lecture.p07network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class App04Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("192.168.0.102", 38080), 5000);
		
		System.out.println("[서버와 연결 성공]");
		OutputStream os = socket.getOutputStream();
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(wr);
		
		Scanner scanner = new Scanner(System.in);
		
		String data = "";
		
		while(true) {
			System.out.print("입력>");
			data = scanner.nextLine();
			bw.write(data);
			bw.newLine();
			bw.flush();
			if(data.equals("exit")) {
				break;
			}
		}
		
		scanner.close();
		bw.close();
		wr.close();
		os.close();
		socket.close();
		System.out.println("클라이언트 프로그램 종료!!!");
	}
}

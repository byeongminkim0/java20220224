package chap18.lecture.p07network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class App02Server {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.102", 38080));
		
		System.out.println("[클라이언트 연결 기다림]");
		Socket socket = serverSocket.accept();
		
		InputStream is = socket.getInputStream();
		Reader rd = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(rd);
		
		System.out.println("[클라이언트가 보낸 메시지 출력]");
		System.out.println(br.readLine());
		
		br.close();
		rd.close();
		is.close();
		socket.close();
		serverSocket.close();
		System.out.println("서버 프로그램 종료!!");
	}
}

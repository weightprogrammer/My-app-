package kosta.cgv;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("서버실행");
			socket = serverSocket.accept();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

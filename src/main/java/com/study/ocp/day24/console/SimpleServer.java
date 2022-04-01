package com.study.ocp.day24.console;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws Exception {
		// 1. 建立 ServerSocket
		int port = 5001;
		ServerSocket server = new ServerSocket(port);
		String serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.printf("已建立 Server 端 %s:%d\n", serverIP, port);
		// 2. 等待 Client 端進來並建立 Socket 連線
		System.out.println("等待 Client 端進來並建立 Socket 連線");
		Socket socket = server.accept();
		System.out.printf("已連入, Client 端 %s:%d\n", socket.getInetAddress(), socket.getPort());
		System.out.println("Socket 連線關閉");
		socket.close();
	}

}

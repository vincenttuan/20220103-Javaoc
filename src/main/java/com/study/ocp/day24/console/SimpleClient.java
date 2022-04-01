package com.study.ocp.day24.console;

import java.net.Socket;
import java.util.Scanner;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入 ServerSocket IP: ");
		String ip = sc.next();
		System.out.print("請輸入 ServerSocket Port: ");
		int port = sc.nextInt();
		// 1. 建立 Socket 連線
		Socket socket = new Socket(ip, port);
		System.out.println("與 Server 端建立連線成功");
		
		// 2. 關閉 Socket 連線
		socket.close();
	}

}

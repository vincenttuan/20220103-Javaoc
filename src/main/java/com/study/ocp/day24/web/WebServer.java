package com.study.ocp.day24.web;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class WebServer {
	public static void main(String[] args) throws Exception {
		WebServer webServer = new WebServer();
		webServer.start();
	}
	
	public void start() throws Exception {
		ServerSocket server;
		System.out.println("WebSserver 啟動");
		server = new ServerSocket(80);
		while (true) {
			System.out.println("等待瀏覽器的連線");
			Socket socket = server.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "big5")), true);
			System.out.println("瀏覽器成功連入");
			System.out.println("瀏覽器傳來的資料 : " + br.readLine()); // 得到 HTTP 文件的第一行
			//----------------------------------------------------------------------------
			// 回應 HTTP 文件結構(4 parts)
			// Part 1 : init line
			out.println("HTTP/1.1 200 OK");
			// Part 2 : header info
			out.println("Content-Type: text/html");
			out.println("Server: GjunWebServer");
			// Part 3 : Blank line
			out.println();
			// Part 4 : Body (回應給瀏覽器的 HTML 內容)
			out.println("<H1>現在時刻: " + new Date() + "</H1>");
			
		}
		
		
	}
}

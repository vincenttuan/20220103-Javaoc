package com.study.ocp.day16;

public class Father extends Thread {
	
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯了");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");
		Worker worker = new Worker();
		worker.start();
		
		try {
			worker.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
	}
	
	// 測試
	public static void main(String[] args) {
		new Father().start();
	}
}

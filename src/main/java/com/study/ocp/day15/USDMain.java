package com.study.ocp.day15;

public class USDMain {

	public static void main(String[] args) {
		USD usd = new USD();
		Thread t1 = new Thread(usd);
		t1.start();
		
		int twd = 1_0000; // 台幣
		// 可以換多少美金 ?
	}

}

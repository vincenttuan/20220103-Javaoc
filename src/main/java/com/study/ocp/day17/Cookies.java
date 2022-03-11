package com.study.ocp.day17;

public class Cookies {
	
	public void put(int i) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 放了第 %d 餅乾\n", tName, i);
	}
	
	public void eat(int i) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 吃了第 %d 餅乾\n", tName, i);
	}
	
}

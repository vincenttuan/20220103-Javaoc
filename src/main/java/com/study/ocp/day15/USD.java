package com.study.ocp.day15;

public class USD implements Runnable {

	@Override
	public void run() {
		double exchange = 28.35;
		System.out.println("USD exchange " + exchange);
	}
	
}

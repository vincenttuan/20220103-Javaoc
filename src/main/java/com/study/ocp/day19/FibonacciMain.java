package com.study.ocp.day19;

public class FibonacciMain {
	public static void main(String[] args) {
		int num = 45;
		long startTime, endTime, result;
		startTime = System.currentTimeMillis();
		result = new Fibonacci().fib(num);
		endTime = System.currentTimeMillis();
		System.out.printf("Recursive fib(%d) = %d in %d ms\n", num, result, (endTime-startTime));
		
	}
}

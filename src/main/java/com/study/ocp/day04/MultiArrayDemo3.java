package com.study.ocp.day04;

import java.util.Arrays;

public class MultiArrayDemo3 {
	public static void main(String[] args) {
		int[][][] scores = {
				{{100, 90, 80}, {70, 60}, {50}},
				{{40, 30}, {20}},
				{{10, 5}}
		}; 
		//System.out.println(scores[0][2][0]);
		// 1.求總分 = ?
		int sum = 0;
		for(int[][] a : scores) {
			for(int[] b : a) {
				for(int c : b) {
					sum += c;
				}
			}
		} 
		System.out.println(sum);
		// 2.求總分 = ?
		int sum2 = Arrays.stream(scores)
				.flatMapToInt(e -> Arrays.stream(e)
										 .flatMapToInt(e2 -> Arrays.stream(e2)))
				.sum();
		System.out.println(sum2);
		
		// 3.求總分 = ?
		int sum3 = Arrays.stream(scores)
				.flatMap(e -> Arrays.stream(e))
				.flatMapToInt(e -> Arrays.stream(e))
				.sum();
		System.out.println(sum3);
		
				
				
	}
}

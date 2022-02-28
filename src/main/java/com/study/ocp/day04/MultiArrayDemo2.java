package com.study.ocp.day04;

import java.util.Arrays;

public class MultiArrayDemo2 {
	public static void main(String[] args) {
		
		int[][] scores = {
				{100, 90, 80},
				{70, 60}
		};
		// 1.求總分 = ?
		int sum1 = scores[0][0] + scores[0][1] + scores[0][2] +
				   scores[1][0] + scores[1][1];
		System.out.println(sum1);
		
		// 2.求總分 = ?
		int sum2 = 0;
		for(int i=0;i<scores.length;i++) {
			for(int k=0;k<scores[i].length;k++) {
				sum2 += scores[i][k];
			}
		}
		System.out.println(sum2);
		
		// 3.求總分 = ?
		int sum3 = 0;
		for(int[] x : scores) {
			for(int y : x) {
				sum3 += y;
			}
		}
		System.out.println(sum3);
		
		// 4.求總分 = ?
		int sum4 = Arrays.stream(scores)
				.map(n -> Arrays.stream(n))
				.mapToInt(e -> e.sum())
				.sum();
		System.out.println(sum4);
		
		// 5.求總分 = ?
		int sum5 = Arrays.stream(scores)
				.flatMapToInt(n -> Arrays.stream(n))
				.sum();
		System.out.println(sum5);
		
	}
}








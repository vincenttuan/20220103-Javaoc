package com.study.ocp.day04;

import java.util.Arrays;

// Java 8 陣列串流(Stream)
// 串流(Stream) 可以做的有: 
// 過濾(filter), 轉換(map), 分析/統計(statistics), 蒐集(collect), 逐筆呈現(foreach)
public class ArrayStreamDemo {
	public static void main(String[] args) {
		int[] nums = {100, 80, 50, 70, 30};
		// 總分 = ?
		int sum = Arrays.stream(nums) // 將陣列轉為串流 stream
						.sum(); // 加總
		System.out.printf("總分: %d\n", sum);
		// 平均 = ?
		double avg = Arrays.stream(nums)
						   .average() // OptionalDouble
						   .getAsDouble(); // 取出 double 資料
		System.out.printf("平均: %.1f\n", avg);
		// 最大值 = ?
		int max = Arrays.stream(nums).max().getAsInt();
		System.out.printf("最大: %d\n", max);
		// 最小值 = ?
		int min = Arrays.stream(nums).min().getAsInt();
		System.out.printf("最小: %d\n", min);
		// 個數 = ?
		long count = Arrays.stream(nums).count();
		System.out.printf("個數: %d\n", count);
	}
}

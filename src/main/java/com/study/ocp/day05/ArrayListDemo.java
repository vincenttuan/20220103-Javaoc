package com.study.ocp.day05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(Integer.valueOf(100));
		nums.add(80); // auto-boxing: Integer.valueOf(80)
		nums.add(90); // auto-boxing: Integer.valueOf(90)
		System.out.println(nums);
		
		int max = nums.stream().mapToInt(n -> n.intValue()).max().getAsInt();
		System.out.println(max);
		int min = nums.stream().mapToInt(n -> n).min().getAsInt();
		System.out.println(min);
		int sum = nums.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		// 排序
		List<Integer> order_nums = nums.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(order_nums);
		
		// 反排序
		List<Integer> reverseOrder_nums = nums.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseOrder_nums);
		
	}

}

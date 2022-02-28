package com.study.ocp.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Diving {

	public static void main(String[] args) {
		// 10 8 7 6 5 9 9 4 8 7
		// 刪除最高與最低個二個分數
		// 求平均(小數點一位)
		// Arrays.asList 不可變動長度的集合
		List<Integer> list = Arrays.asList(10, 8, 7, 6, 5, 9, 9, 4, 8, 7);
		System.out.println(list);
		Collections.sort(list); // 排序
		System.out.println(list);
		// 轉為可變動集合, 例如: ArrayList
		List<Integer> list2 = new ArrayList<Integer>(list);
		list2.remove(0);
		list2.remove(0);
		list2.remove(list2.size()-1);
		list2.remove(list2.size()-1);
		System.out.println(list2);
		double avg = list2.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
		System.out.printf("%.1f\n", avg);
		
	}

}

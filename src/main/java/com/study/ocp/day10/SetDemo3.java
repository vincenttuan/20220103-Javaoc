package com.study.ocp.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(null);
		set.add(90);
		set.add(80);
		// 總分 (Java 8)
		int sum = set.stream()
					.filter(e -> e != null)
					.mapToInt(Integer::intValue)
					.sum();
		System.out.println(sum);
		
		
	}

}

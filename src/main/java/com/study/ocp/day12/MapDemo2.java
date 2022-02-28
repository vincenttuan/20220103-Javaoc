package com.study.ocp.day12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("A", 100);
		map.put("B", 50);
		map.put("C", 80);
		map.put("D", 40);
		map.put("E", 90);
		
		// Map -> stream -> filter -> String
		String result = map.entrySet()
				.stream()
				.filter(x -> x.getValue() >= 60)
				.map(x -> x.getKey())
				.collect(Collectors.joining());
		System.out.println("及格科目:" + result);
		
		// Map > stream -> filter -> Map part I
		Map<String, Integer> passMap = map.entrySet()
				.stream()
				.filter(x -> x.getValue() >= 60)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		System.out.println(passMap);
		
		// Map > stream -> filter -> Map part II
		Map<String, Integer> passMap2 = map.entrySet()
				.stream()
				.filter(x -> x.getValue() >= 60)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(passMap2);
	}
}

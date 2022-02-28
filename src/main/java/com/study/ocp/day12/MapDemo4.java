package com.study.ocp.day12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.mapping;

public class MapDemo4 {

	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple",  10, 10), // 一箱水果
				new Fruit("banana", 10, 15),
				new Fruit("papaya", 15, 15),
				new Fruit("orange", 10, 20),
				new Fruit("melon",  40, 20),
				new Fruit("apple",  15, 10),
				new Fruit("apple",  20, 10),
				new Fruit("banana", 25, 15),
				new Fruit("orange", 30, 20));
		
		// 請問每個水果有幾箱 ?
		// apple=3, banana=2, papaya=1, orange=2, melon=1
		Map<String, Long> result1 = fruits.stream()
				.collect(groupingBy(Fruit::getName, counting()));
		System.out.println(result1);
		
		// 請問每個水果有顆 ?
		// orange=40, papaya=15, banana=35, apple=45, melon=40
		Map<String, Integer> result2 = fruits.stream()
				.collect(groupingBy(Fruit::getName, summingInt(Fruit::getQty)));
		System.out.println(result2);
		
		// 根據水果價格來分類
		// {20=[Fruit [name=orange, qty=10, price=20], Fruit [name=melon, qty=40, price=20], Fruit [name=orange, qty=30, price=20]], 10=[Fruit [name=apple, qty=10, price=10], Fruit [name=apple, qty=15, price=10], Fruit [name=apple, qty=20, price=10]], 15=[Fruit [name=banana, qty=10, price=15], Fruit [name=papaya, qty=15, price=15], Fruit [name=banana, qty=25, price=15]]}
		Map<Integer, List<Fruit>> result3 = fruits.stream().collect(groupingBy(Fruit::getPrice));
		System.out.println(result3);
		
		// 去除重複資料
		// {20=[orange, melon], 10=[apple], 15=[banana, papaya]}
		Map<Integer, Set<String>> result4 = fruits.stream()
				.collect(groupingBy(Fruit::getPrice, mapping(Fruit::getName, toSet())));
		System.out.println(result4);
		
		// 水果加總
		// {orange=800, papaya=225, banana=525, apple=450, melon=800}
		// 2800
		Map<String, Integer> result5 = fruits.stream()
				.collect(groupingBy(Fruit::getName, summingInt(fruit->fruit.getPrice() * fruit.getQty())));
		System.out.println(result5);
		int sum = result5.entrySet().stream().mapToInt(entry -> entry.getValue()).sum();
		System.out.println(sum);
	}

}

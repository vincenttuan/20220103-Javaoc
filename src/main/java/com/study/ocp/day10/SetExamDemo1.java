package com.study.ocp.day10;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamDemo1 {
	public static void main(String[] args) {
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("英文", 80);
		Exam e3 = new Exam("數學", 90);
		Exam e4 = new Exam("國文", 100);
		Set<Exam> set = new LinkedHashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println(set.size());
		System.out.println(set);
		// 最高分是哪一科 ?
		// 最低分是哪一科 ?
		/*
		@FunctionalInterface
		public interface Comparator<T> {
		    int compare(T o1, T o2);
		} 
		 * */
		Exam max = set.stream().max((o1, o2) -> o1.getScore() - o2.getScore()).get();
		Exam min = set.stream().min((o1, o2) -> o1.getScore() - o2.getScore()).get();
		System.out.println("max = " + max.getName());
		System.out.println("min = " + min.getName());
		
		max = set.stream().max(Comparator.comparing(e -> e.getScore())).get();
		System.out.println("max = " + max.getName());
		min = set.stream().min(Comparator.comparing(Exam::getScore)).get();
		System.out.println("min = " + min.getName());
		
		
	}
}

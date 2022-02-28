package com.study.ocp.day08;

public class Zoo {
	public static void main(String[] args) {
		/*
		Cat c1 = new Tiger();
		c1.move();
		Cat c2 = (Cat)new Tiger();
		c2.move();
		((Cat)new Tiger()).move();
		*/
		Animal animal = new Tiger();
		// 透過 instanceof 來檢驗是否可以轉型
		if(animal instanceof Cat) {
			((Cat)animal).move();
		} else {
			System.out.println("animal 不可轉型成 Cat");
		}
		if(animal instanceof Fish) {
			((Fish)animal).move();
		} else {
			System.out.println("animal 不可轉型成 Fish");
		}
		
		
		
	}
}

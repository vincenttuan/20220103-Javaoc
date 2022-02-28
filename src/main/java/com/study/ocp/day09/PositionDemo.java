package com.study.ocp.day09;

public class PositionDemo {
	public static void main(String[] args) {
		printSalary(Position.副總);
		printSalary(Position.經理);
	}

	public static void printSalary(Position pos) {
		switch (pos) {
			case 一般員工:
				System.out.println("4,0000");
				break;
			case 經理:
				System.out.println("7,0000");
				break;
			case 副總:
				System.out.println("10,0000");
				break;
			case 總經理:
				System.out.println("20,0000");
				break;

		}
	}
}

package com.study.ocp.day13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData3 {

	public static void main(String[] args) {
		int[] data = {10, 5, 2, 0};
		int x = 10; // 分子
		System.out.print("分子 " + x + " / 分母 " + Arrays.toString(data) + " 中選一個, 請輸入 index = ");
		Scanner sc = new Scanner(System.in);
		int index = 0;
		try {
			index = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("請輸入數字, 重新執行");
			return;
		}
		// 1. 判斷資料是否合法 index 是不是介於 0~3 之間
		if(index < 0 || index >= data.length) {
			System.out.println("index 範圍錯誤, 請重新執行");
			return;
		}
		// 2. 分母不可 = 0
		if(data[index] == 0) {
			System.out.println("分母不可 = 0, 請重新執行");
			return;
		}
		int result = x / data[index];
		System.out.println(result);
		System.out.println("end.");
	}

}

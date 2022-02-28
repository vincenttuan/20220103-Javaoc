package com.study.ocp.day05;

import java.util.Arrays;

public class EmployeeTest2 {

	public static void main(String[] args) {
		// 建立員工物件
		Employee e1 = new Employee("John", 25, 50000);
		Employee e2 = new Employee("Mary", 27, 60000);
		Employee e3 = new Employee("Mark", 31, 90000);
		// 1. 請求出總薪資 = ?
		int sum1 = e1.getSalary() + e2.getSalary() + e3.getSalary();
		System.out.printf("總薪資: $%,d\n", sum1);
		
		// 2. 請求出總薪資 = ?
		Employee[] employees = {e1, e2, e3};
		int sum2 = 0;
		for(Employee employee : employees) {
			sum2 += employee.getSalary();
		}
		System.out.printf("總薪資: $%,d\n", sum2);
		
		// 3. 請求出總薪資 = ? 使用 java 8 stream 來計算
		int sum3 = Arrays.stream(employees).mapToInt(emp -> emp.getSalary()).sum();
		System.out.printf("總薪資: $%,d\n", sum3);
		int sum4 = Arrays.stream(employees).mapToInt(Employee::getSalary).sum();
		System.out.printf("總薪資: $%,d\n", sum4);
		
		// 4. Homework employees 可以依照薪資大小排序
		
	}

}

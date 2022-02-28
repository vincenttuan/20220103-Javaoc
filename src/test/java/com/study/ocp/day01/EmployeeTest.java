package com.study.ocp.day01;

import java.util.Date;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void test() {
		Employee e1 = new Employee();
		e1.name = "John";
		e1.birth = new Date();
		e1.salary = 50000;
		
		System.out.printf("name: %s birth: %s salary: $%,d 工作:", 
						  e1.name, e1.birth, e1.salary);
		e1.job();
		
	}

}

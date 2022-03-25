package com.study.ocp.day22;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee john = new Employee("John");
		System.out.println(john);
		// 如何將 john 物件序列化並存檔為 john.ser
		String filePath = "src\\main\\java\\com\\study\\ocp\\day22\\files\\john.ser";
		try(FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(john);
			
			System.out.println("序列化寫檔完成!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

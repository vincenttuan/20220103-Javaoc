package com.study.ocp.day22;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyData {

	public static void main(String[] args) {
		String sourPath = "src\\main\\java\\com\\study\\ocp\\day22\\files\\data.txt";
		String destPath = "src\\main\\java\\com\\study\\ocp\\day22\\files\\data_backup.txt";
		try(FileReader fr = new FileReader(sourPath);
			FileWriter fw = new FileWriter(destPath);) {
			char[] buffer = new char[1];
			while (fr.read(buffer) != -1) {
				fw.write(buffer); // 將 char[] 寫入
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Copy OK!");
	}

}

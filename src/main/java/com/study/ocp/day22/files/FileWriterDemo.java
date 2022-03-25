package com.study.ocp.day22.files;

import java.io.FileWriter;
import java.util.Date;

public class FileWriterDemo {

	public static void main(String[] args) {
		String filePath = "src\\main\\java\\com\\study\\ocp\\day22\\files\\foo.txt";
		try(FileWriter fr = new FileWriter(filePath)) {
			String data1 = "現在時間:" + new Date().toString();
			String data2 = "\n";
			String data3 = "Welcome!";
			fr.write(data1);
			fr.write(data2);
			fr.write(data3);
			System.out.println("File 內容寫入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

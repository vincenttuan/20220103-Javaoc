package com.study.ocp.day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

public class FindWordCountByLength {
	// 印出每個長度的單字數量
	public static void main(String[] args) {
		Path path = Paths.get("src\\main\\java\\com\\study\\ocp\\day23\\words.txt");
		try(Stream<String> lines = Files.lines(path)) {
			
			// your code here
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

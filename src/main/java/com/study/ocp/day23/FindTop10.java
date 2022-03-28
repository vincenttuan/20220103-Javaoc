package com.study.ocp.day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FindTop10 {
	// 找出 words.txt 字典內最長的 10 個單字
	public static void main(String[] args) {
		Path path = Paths.get("src\\main\\java\\com\\study\\ocp\\day23\\words.txt");
		try(Stream<String> lines = Files.lines(path)) {
			
			// your code here ...
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

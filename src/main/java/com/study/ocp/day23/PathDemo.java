package com.study.ocp.day23;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path path = Paths.get("src\\main\\java\\com\\study\\ocp\\day23\\PathDemo.java"); // 相對路徑
		//Path path = Paths.get("C:\\Users\\student\\eclipse-workspace\\ocp\\src\\main\\java\\com\\study\\ocp\\day23\\PathDemo.java"); // 絕對路徑
		System.out.println(path);
		System.out.printf("getFileName: %s\n", path.getFileName());
		System.out.printf("getParent: %s\n", path.getParent());
		System.out.printf("getRoot: %s\n", path.getRoot()); // 相對路徑會得到 null, 絕對路徑會得到 root 資料, 例如: C:\
		// subpath(from, to) 範圍 from <= path < to
		System.out.printf("subpath(0, 2): %s\n", path.subpath(0, 2));
		// 判斷路徑是絕對或相對路徑
		System.out.printf("isAbsolute(): %s\n", path.isAbsolute());
		if(!path.isAbsolute()) {
			// 取得絕對路徑
			System.out.println(path.toAbsolutePath());
		}
		// 換成 Uri 格式
		URI uri = path.toUri();
		System.out.println(uri);
	}

}

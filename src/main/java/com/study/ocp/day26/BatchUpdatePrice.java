package com.study.ocp.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BatchUpdatePrice {
	public static void main(String[] args) throws Exception {
		// 將最新報價資料更新到 stock 資料表
		String sql = "select symbol from stock";
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day26/demo.db";
		Connection conn = DriverManager.getConnection(dbUrl);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<String> symbols = new ArrayList<>();
		while(rs.next()) {
			symbols.add(rs.getString("symbol"));
		}
		System.out.println(symbols);
		// 利用 java yahoo finance api 查詢股價資料
		// https://financequotes-api.com/
		
		
	}
}

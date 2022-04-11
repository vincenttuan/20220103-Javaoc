package com.study.ocp.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CreateTables {

	public static void main(String[] args) throws Exception {
		String create_classify_table_sql = "create table classify( "
				+ "id integer primary autoincrement, "
				+ "name varchar(50) "
				+ ")";
		
		String create_stock_table_sql = "create table stock( "
				+ "id integer primary autoincrement, "
				+ "symbol varchar(50), "
				+ "name varchar(50), "
				+ "price real, "
				+ "classify_id integer, "
				+ "constraint fk_classify_id foreign key (classify_id) references classify(id) "
				+ ")";
		
		String create_portfolio_table_sql = "create table portfolio( "
				+ "id integer primary autoincrement, "
				+ "symbol varchar(50), "
				+ "shares integer, "
				+ "cost real,"
				+ "constraint fk_symbol foreign key (symbol) references stock(symbol) "
				+ ")";
		
		String dbUrl = "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo.db";
		Connection conn = DriverManager.getConnection(dbUrl);
		Statement stmt = conn.createStatement();
		stmt.clearBatch(); // 清除 batch
		stmt.addBatch(create_classify_table_sql);
		stmt.addBatch(create_stock_table_sql);
		stmt.addBatch(create_portfolio_table_sql);
		int[] rowcounts = stmt.executeBatch();
		System.out.println("Batch create tables, rowcounts = " + rowcounts);
	}

}

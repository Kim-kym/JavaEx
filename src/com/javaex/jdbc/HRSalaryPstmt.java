package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSalaryPstmt {
	static final String dburl = "jdbc:mysql://localhost:3306/hrdb";
	static final String dbuser = "hrdb"; 
	static final String dbpass = "hrdb";


	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			System.out.print("급여 입력:");
			String input = scanner.nextLine();
			String[] tokens = input.split(" ");
			
			int minSalary = Integer.parseInt(tokens[0]);
			int maxSalary = Integer.parseInt(tokens[1]);
		
			System.out.println("=========================================");
			//	실행 계획 수립 
			String sql = "SELECT CONCAT(first_name, ' ', last_name) full_name, " +
					"salary FROM employees " + 
					"WHERE salary BETWEEN ? AND ? ORDER BY Salary";
			//	데이터 바인딩 위치를 ?로 설정, 동적으로 데이터를 연결 시킴 
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2,  maxSalary);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%S\t%d%n",
						rs.getString(1),
						rs.getInt(2));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
			
			}
			scanner.close();
		}
	}

}

package com.pgr.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilMethodsExamples {

	public static void main(String[] args) {
		try {
			Connection con = MySQLConnectionUtil.getOracleDBConnection();
			
			//String selectMaxSalaryEmployee = "select  MAX(SALARY) as salary from emp";
			String countStr = "select  count(*) as total_emp_count from emp";
			PreparedStatement ps = con.prepareStatement(countStr);
			
			ResultSet set= ps.executeQuery();
			while(set.next()) {
				System.out.println(set.getInt("total_emp_count"));
				//System.out.println(set.getString(2));
				//System.out.println(set.getFloat("salary"));
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

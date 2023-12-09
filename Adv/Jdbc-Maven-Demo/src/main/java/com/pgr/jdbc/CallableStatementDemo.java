package com.pgr.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			Connection con = MySQLConnectionUtil.getOracleDBConnection();
			String insertProcedure = "{CALL InsertEmp_PS(?,?,?)};";
			CallableStatement callStmt = con.prepareCall(insertProcedure);
			callStmt.setInt(1, 111);
			callStmt.setString(2, "Vidhya");
			callStmt.setInt(3, 5000);
			callStmt.execute();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

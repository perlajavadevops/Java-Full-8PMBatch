package com.pgr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionUtil {

	public static Connection getOracleDBConnection() throws ClassNotFoundException, SQLException {
		// step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");// connection
		return con;
	}

}

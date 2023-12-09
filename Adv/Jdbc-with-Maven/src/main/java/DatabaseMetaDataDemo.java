import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetaDataDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");// connection
		System.out.println("con " + con);

		DatabaseMetaData dbmd = con.getMetaData();

		/*
		 * System.out.println("Driver Name: " + dbmd.getDriverName());
		 * System.out.println("Driver Version: " + dbmd.getDriverVersion());
		 * System.out.println("UserName: " + dbmd.getUserName());
		 * System.out.println("Database Product Name: " +
		 * dbmd.getDatabaseProductName());
		 * System.out.println("Database Product Version: " +
		 * dbmd.getDatabaseProductVersion());
		 */
		String table[] = { "TABLE" };
		ResultSet rs = dbmd.getTables(null, null, null, table);

		while (rs.next()) {
			System.out.println(rs.getString(3));
		}

		/*
		 * // step 3 PreparedStatement preStmt =
		 * con.prepareStatement("select * from emp_details_1 where id =?");
		 * preStmt.setInt(1, 104);
		 * 
		 * ResultSet rs = preStmt.executeQuery(); while (rs.next()) {// 1
		 * System.out.println(rs.getInt(1));
		 * 
		 * System.out.println(rs.getString(2)); System.out.println(rs.getString(3));
		 * System.out.println(rs.getDouble("salary"));
		 * System.out.println(rs.getString(5));
		 * 
		 * }
		 */

		// step 5
		con.close();
	}
}

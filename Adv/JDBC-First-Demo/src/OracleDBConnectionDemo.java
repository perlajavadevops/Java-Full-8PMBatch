import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDBConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step1
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step2
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "password");

		// step3
		Statement stmt = con.createStatement();

		// step4 -- reading the data from db
		ResultSet rs = stmt.executeQuery("select * from emp");

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		//step 5
		con.close();

	}
}

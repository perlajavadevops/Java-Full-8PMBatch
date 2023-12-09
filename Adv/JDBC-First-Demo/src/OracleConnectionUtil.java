import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionUtil {

	public static Connection getOracleDBConnection() throws ClassNotFoundException, SQLException {
		// step1
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step2
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "password");

		return con;
	}

}

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Date;

public class SQLDateDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {

			String insertQuery = "insert into employee_2 (id, dob) values (?,?)";
			con = DBConnectionUtil.getMySQLConnection();

			// insert into employee_2 (id, dob) values (1, Date('2018-08-07'));

			// con = DBConnectionUtil.getOracleConnection();
			PreparedStatement preStmt = con.prepareStatement(insertQuery);
			preStmt.setInt(1, 2);

			
			String dateStr = "2018-08-07";
			LocalDate date = LocalDate.parse(dateStr);
			// Date date = new Date(dateStr);
			java.sql.Date sqlDate = java.sql.Date.valueOf(date.toString());
			preStmt.setDate(2, sqlDate);

			//preStmt.executeUpdate();

			/*
			 * ParameterMetaData metaData = preStmt.getParameterMetaData();
			 * System.out.println(metaData.getParameterCount());
			 * System.out.println(metaData.getParameterTypeName(1));
			 */

			
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

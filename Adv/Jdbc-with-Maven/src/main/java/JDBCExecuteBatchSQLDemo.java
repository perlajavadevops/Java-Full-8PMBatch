import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class JDBCExecuteBatchSQLDemo {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DBConnectionUtil.getMySQLConnection();


			String insertQuery = "insert into emp_details_1 (id, first_name, last_name, salary, email) values (?, ?, ?, ?,?)";

			// String updateQuery = "UPDATE emp_details_1 SET email = ?, salary=?,
			// first_name=?, last_name=? WHERE id= ?";
			PreparedStatement preStmt = con.prepareStatement(insertQuery);
						// update set parameters
			/*
			 * preStmt.setString(1, "dhruvthar@gmail.com"); preStmt.setFloat(2, 3000);
			 * preStmt.setString(3, "Thar1"); preStmt.setString(4, "Dhruv1");
			 * preStmt.setInt(5, 104);
			 */

			// insert set parameters
			preStmt.setInt(1, 112);
			preStmt.setString(5, "dhruvthar_abc@gmail.com");
			preStmt.setFloat(4, 3000);
			preStmt.setString(2, "Thar1");
			preStmt.setString(3, "Dhruv1");
			preStmt.addBatch();

			// insert set parameters
			preStmt.setInt(1, 113);
			preStmt.setString(5, "dhruvthar_def@gmail.com");
			preStmt.setFloat(4, 3000);
			preStmt.setString(2, "Thar1");
			preStmt.setString(3, "Dhruv1");

			preStmt.addBatch();

			int[] i = preStmt.executeBatch();
			System.out.println(i.length);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

}

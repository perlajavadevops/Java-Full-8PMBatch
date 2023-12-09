import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CallableStatmentDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			//con = DBConnectionUtil.getMySQLConnection();

			con = DBConnectionUtil.getOracleConnection();
			// PreparedStatement preStmt = con.prepareStatement(insertQuery);

			//CallableStatement callStmt = con.prepareCall("{call InsertEmpDetails_SP(?,?,?,?,?)}");
			CallableStatement callStmt = con.prepareCall("{call InsertEmpDetails(?,?,?,?,?)}");

			callStmt.setInt(1, 108);
			callStmt.setString(2, "C");
			callStmt.setString(3, "D");
			callStmt.setFloat(4, 1000);
			callStmt.setString(5, "c@gma.com");

			boolean flag = callStmt.execute();
			System.out.println(flag);
			con.close();
//			/107,'A','B', 100, 'a@gmail.com');

		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
}

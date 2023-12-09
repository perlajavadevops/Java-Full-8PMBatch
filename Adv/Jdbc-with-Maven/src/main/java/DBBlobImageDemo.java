import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBBlobImageDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

		Connection con = DBConnectionUtil.getMySQLConnection();

		//Connection con = DBConnectionUtil.getOracleConnection();

		String selectImageQuery = "select * from emp_image_tbl where id=?";
		String insertImageQuery = "INSERT INTO emp_image_tbl VALUES (?,?,?)";
		PreparedStatement preStmt = con.prepareStatement(selectImageQuery);
		// insert query set parameters
		/*
		 * preStmt.setInt(1, 102); preStmt.setString(2, "Reddy");
		 * 
		 * FileInputStream fis = new FileInputStream("E:/JDBC/hashset.png");
		 * 
		 * preStmt.setBlob(3, fis, fis.available());
		 * 
		 * int j = preStmt.executeUpdate(); System.out.println(j);
		 */

		preStmt.setInt(1, 102);
		ResultSet rs = preStmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1));

			System.out.println(rs.getString(2));
			FileOutputStream fos = new FileOutputStream("E:/JDBC/hashset_12.png");

			Blob blob = rs.getBlob(3);
			byte[] imageBlob = blob.getBytes(1, (int) blob.length());
			fos.write(imageBlob);
			fos.close();

		}

		con.close();

		con.close();

		// create table emp_image_tbl(id int, name varchar(30), image blob);
	}
}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleCRUDDemoTransactionManagement {

	public void saveEmp() throws ClassNotFoundException, SQLException {

		Connection con = OracleConnectionUtil.getOracleDBConnection();
		con.setAutoCommit(false);
		// Statement and PrepareStatement

		// Statement stmt = con.createStatement();
		// String insertQuery = "insert into emp (empno, name, salary) values
		// (100,"+"'PerlaReddy'"+",2000)";
		// int i = stmt.executeUpdate(insertQuery);
		// PrepareStatement Example

		String prepareInsertQuery = "insert into emp (empno, name, salary) values (?,?,?)";
		PreparedStatement pre = con.prepareStatement(prepareInsertQuery);
		pre.setInt(1, 110);
		pre.setString(2, "Dhatrika Sai");
		pre.setInt(3, 4000);

		boolean i = pre.execute();
		System.out.println(i);

		//con.commit();
		con.close();
	}

	public void updateEmp() throws ClassNotFoundException, SQLException {

		Connection con = OracleConnectionUtil.getOracleDBConnection();

		// Statement and PrepareStatement

		// Statement stmt = con.createStatement();
		// String insertQuery = "insert into emp (empno, name, salary) values
		// (100,"+"'PerlaReddy'"+",2000)";
		// int i = stmt.executeUpdate(insertQuery);
		// PrepareStatement Example

		String prepareUpdateQuery = "update emp set salary = ?, name=? where empno=?";
		PreparedStatement pre = con.prepareStatement(prepareUpdateQuery);
		pre.setInt(1, 7000);
		pre.setString(2, "Dhruvika Shree");
		pre.setInt(3, 110);
	
		int i = pre.executeUpdate();
		System.out.println(i);

		con.close();
	}
	
	public void deleteEmp() throws ClassNotFoundException, SQLException {

		Connection con = OracleConnectionUtil.getOracleDBConnection();

		// Statement and PrepareStatement

		// Statement stmt = con.createStatement();
		// String insertQuery = "insert into emp (empno, name, salary) values
		// (100,"+"'PerlaReddy'"+",2000)";
		// int i = stmt.executeUpdate(insertQuery);
		// PrepareStatement Example

		String prepareDeleteQuery = "delete from emp where empno=?";
		PreparedStatement pre = con.prepareStatement(prepareDeleteQuery);
		pre.setInt(1, 110);
	
		int i = pre.executeUpdate();
		System.out.println(i);

		con.close();
	}
	
	public void getAllEmps() throws ClassNotFoundException, SQLException {
		Connection con = OracleConnectionUtil.getOracleDBConnection();

		String allRecordsQuery =  "select * from emp";
		PreparedStatement pre = con.prepareStatement(allRecordsQuery);
		ResultSet rs = pre.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		//step 5
		con.close();
	}
	
	
	public void getEmpById() throws ClassNotFoundException, SQLException {
		Connection con = OracleConnectionUtil.getOracleDBConnection();

		String allRecordsQuery =  "select * from emp where empno=?";
		PreparedStatement pre = con.prepareStatement(allRecordsQuery);
		pre.setInt(1, 105);
		ResultSet rs = pre.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		//step 5
		con.close();
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		OracleCRUDDemoTransactionManagement crudDemo = new OracleCRUDDemoTransactionManagement();
		crudDemo.saveEmp();
		//crudDemo.updateEmp();
		//crudDemo.deleteEmp();
		//crudDemo.getAllEmps();
		//crudDemo.getEmpById();
	}
}

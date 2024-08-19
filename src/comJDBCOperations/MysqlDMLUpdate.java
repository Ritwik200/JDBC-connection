package comJDBCOperations;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlDMLUpdate {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Nte#25");
		
		Statement stmt = con.createStatement();
		String s = "Update book_det1 SET book_n='CS010' WHERE author='Rit';";
		stmt.execute(s);
		con.close();
		System.out.println("Data updated"); 
	}

}

package comJDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLCommands {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Nte#25");
		
		Statement stmt = con.createStatement();
		String s = "Insert into book_det1 values('CS004','MicronTesting','AI','Rit','vtu','y','2024','999');";
		stmt.execute(s);
		con.close();
		System.out.println("Data updated");
	}

}

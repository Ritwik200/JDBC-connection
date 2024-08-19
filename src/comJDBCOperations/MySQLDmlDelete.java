package comJDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDmlDelete {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Nte#25");
			
			Statement stmt = con.createStatement();
			String s = "delete from book_det1 where book_n='PH03';";
			stmt.execute(s);
			con.close();
			System.out.println("Data updated"); 
		}
	}



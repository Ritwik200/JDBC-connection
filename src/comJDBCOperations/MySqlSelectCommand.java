package comJDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MySqlSelectCommand {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb","root","Nte#25");
		Statement stmt = con.createStatement();
		String QUERY = "select book_n,title,sub_code,author from book_det1;";
		
		ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				System.out.println("Bro: "+ rs.getString("book_n"));
				System.out.println("tit: "+rs.getString("title"));
				System.out.println("scode: "+rs.getString("sub_code"));
				System.out.println("aut: "+rs.getString("author"));
				String Bro = rs.getString("book_n");
				String tit = rs.getString("title"); 
				String scode = rs.getString("sub_code");
				String aut = rs.getString("author");
				System.out.println(Bro+" "+tit+" "+scode+" "+aut+" ");
			}
			con.close();
			System.out.println("Statement executed");
		}
	
}

package comJDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCExample {
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/mydb";
	static final String USER = "root";
	static final String PASS = "Nte#25";
	static final String QUERY = "select book_n,title,sub_code,author from book_det1";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try ( Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY); ) {
			while (rs.next()) {
				System.out.println("Bro: "+ rs.getString("book_n"));
				System.out.println("tit: "+rs.getString("title"));
				System.out.println("scode: "+rs.getString("sub_code"));
				System.out.println("aut: "+rs.getString("author"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

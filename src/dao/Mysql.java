package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql {

	public static void main(String[] args) {
		 
	      String jdbc_driver = "com.mysql.cj.jdbc.Driver";
	      String jdbc_url = "jdbc:mysql://localhost:3306/bigdata?serverTimezone=UTC";
	      try {
	          
	         Class.forName(jdbc_driver);
	         Connection con = DriverManager.getConnection(jdbc_url, "root", "bigdata");
	         Statement st = con.createStatement();
	         
	         String sql = "SELECT * FROM customer";
	         ResultSet rs = st.executeQuery(sql);
	 
	         while(rs.next()){       
	             String uid = rs.getString(1);
	             String uname = rs.getString(2);
	             String uphone = rs.getString(3);
	 
	             System.out.println(uid + " " + uname+ " " + uphone);
	         }
	 
	      
	         rs.close();
	         st.close();
	         con.close();    
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      } 
	   }
}

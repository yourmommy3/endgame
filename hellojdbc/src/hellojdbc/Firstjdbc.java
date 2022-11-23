package hellojdbc;

import java.sql.*;

public class Firstjdbc{
 
public static void main(String args[]) {
    String url = "jdbc:mysql://localhost:3306/ep";
    String usr = "root";
    String pwd = "tester";
    String deletesql = ("delete from student where no=?"); 
    String sql = ("update student set name=? where no=1");
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,usr,pwd);
      
      PreparedStatement p = con.prepareStatement(sql);
      PreparedStatement deleteP = con.prepareStatement(deletesql); 
      
      //deleteP.setInt(1, 4);
      //deleteP.executeUpdate();
      p.setString(1, "jjjjj");
      p.executeUpdate();
      //Statement: which is used for accessing the data, it will not accept any parameters at runtime.
      Statement stmt=con.createStatement();
      ResultSet rs= stmt.executeQuery("select * from student");
      
	      
      
      while(rs.next())
        System.out.println("|"+rs.getInt(1)+"" +"|"+rs.getString(2));
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
}
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class Firstjdbc {
	public static void main(String args[]) {
		 String url = "jdbc:mysql://localhost:3306/ep";
		    String user = "root";
		    String password = "tester";
		    try {
		      Class.forName("com.mysql.jdbc.Driver");
		      Connection con = DriverManager.getConnection(url,user,password);
		      System.out.println("Connection successfully established");
		    } catch (ClassNotFoundException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    } catch (SQLException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
	}
	
}

}
*/

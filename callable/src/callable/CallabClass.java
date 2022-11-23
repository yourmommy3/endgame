package callable;
import java.sql.*;


public class CallabClass {
	public static void main(String args[]) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/ep";
		String un = "root"; 
		String pass = "tester123"; 
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,un,pass); 
				//create a procedure
				CallableStatement st = con.prepareCall("{call test_pro(?,?)}");
				st.setInt(1, 5);
				st.setString(2,"from test_pro");
				st.execute();
				Statement stmt=con.createStatement();    
				ResultSet rs= stmt.executeQuery("select * from callstudent");
				while(rs.next())
					 System.out.println(rs.getInt(1)+" "+rs.getString(2));
			    
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
}

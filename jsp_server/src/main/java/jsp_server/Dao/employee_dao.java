package jsp_server.Dao;

import java.io.PrintWriter;
import java.sql.*;

import org.apache.catalina.connector.Response;

import jsp_server.bean.employee;

public class employee_dao {
	public static Connection getConnection() {
		Connection con = null; 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","tester"); 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public boolean insertEmployee(employee emp) {
		String sql = "insert into emp values(?,?,?,?);";
		try {
			PreparedStatement p = getConnection().prepareStatement(sql);
			p.setInt(1, emp.getEmp_id());			
			p.setString(2,emp.getEmp_name()); 
			p.setDouble(3,emp.getEmp_sal()); 
			p.setString(4,emp.getEmp_email());
			return p.executeUpdate()>0; 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}
	public boolean deleteEmployee(employee emp) {
		String sql = "delete from emp where emp_id= ?; ";
		try {
			PreparedStatement p = getConnection().prepareStatement(sql);
			p.setInt(1, emp.getEmp_id());			
			return p.executeUpdate()>0; 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}
	public boolean updateEmployee(employee emp) {
		String sql = "update emp set emp_name=?,emp_sal=?,emp_email=? where emp_id=?;";
		try {
			PreparedStatement p = getConnection().prepareStatement(sql);
			
			p.setString(1,emp.getEmp_name()); 
			p.setDouble(2,emp.getEmp_sal()); 
			p.setString(3,emp.getEmp_email());
			p.setInt(4, emp.getEmp_id());			
			return p.executeUpdate()>0; 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	}
	public boolean selectEmployee(employee emp) {
	
		String sql = "select * from emp where emp_id=?;";
		try {
			PreparedStatement p = getConnection().prepareStatement(sql);
			p.setInt(1, emp.getEmp_id());			
			return p.executeQuery() != null; 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return false;
	
	}
}

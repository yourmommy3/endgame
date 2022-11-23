package servlet.temp;

import java.sql.*; 
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class regservlet
 */
public class regservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public regservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass"); 
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","tester"); 
			String s = "insert into reg values(?,?,?)"; 
			PreparedStatement p = con.prepareStatement(s); 
			p.setString(1, name);
			p.setString(2, email);
			p.setString(3, pass);
			int i = p.executeUpdate();
			if (i>0) {
				out.print("updated"); 
				 Statement stmt=con.createStatement();
			     ResultSet rs= stmt.executeQuery("select * from reg");
			     
			      while(rs.next())
			        System.out.println("|"+rs.getString(1)+"" +"|"+rs.getString(2));
			     
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		out.close();
		
		
		
		
		
		
		
		
		//doGet(request, response);
	}

}

package log.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class loginserv
 */
public class loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.getWriter().append("").append(request.getContextPath());
		PrintWriter out = response.getWriter();
        ResultSet rs;
        ////and your select statement 

        String name = request.getParameter("name"); 
		String pass = request.getParameter("pass"); 
		
        try{
            String sql = "SELECT * FROM reg WHERE name = ? AND pass = ?";
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep", "root", "tester");

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, pass);

             Statement s = con.createStatement();
             rs =preparedStatement.executeQuery();

         ////if there are next ib rs so you have a user by this id and password 
             if(rs.next()) {

             	Cookie ck = new Cookie("name", name); 
     			response.addCookie(ck);
     			response.sendRedirect("index.html");
    			
             }
             else {
			     out.println("PASSWORD OR USERNAME IS WRONG");
             }
                  		

        }catch(Exception e) {
            System.out.println("The exception is" + e);
        }

	}

}

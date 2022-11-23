package log.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class indexserv
 */
public class indexserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("").append(request.getContextPath());
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        //request.getRequestDispatcher("link.html").include(request, response);  
          
        Cookie ck[]=request.getCookies();  
        if(ck!=null){  
         String name=ck[0].getValue();  
        if(!name.equals("")||name!=null){  
            out.print("<b>Welcome to Profile</b>");  
            out.print("<br>Welcome, "+name);  
        }  
        else{  
            out.print("Please login first");  
            request.getRequestDispatcher("login.html").include(request, response);  
        } }
        out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

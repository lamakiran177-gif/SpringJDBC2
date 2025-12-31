package login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginurl")
public class Loginclass extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter po=resp.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, resp);
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		if(pass.equals("kiranlama"))
		{
			po.println("<h3 style=\"color:green;text-align:center\">Welcome "+uname+"</h3>");

			
			HttpSession session=req.getSession();
			session.setAttribute("uname",uname);
		}
		
		else{
			 po.println("<h3 style=`color:res;text-aling:center`>Sorry, Wrong password or username...</h3>");
			 req.getRequestDispatcher("login.html").include(req, resp);
		}
		
	}
    
	
}

package login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profailurl")
public class Profail extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
 throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter po=resp.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, resp);
		
		HttpSession session=req.getSession(false); 
		if(session!=null) 
		{
			String uname=(String) session.getAttribute("uname");
			po.println("<h3 style=\"color:green;text-align:center\">Welcome "+uname+"</h3>");

			po.println("You can seee your Data");
		}
		else {
		     po.println("<h3 style=`color:red;text-align:center`>Plz Login to see profile page</h3>");
		}
		}
		
		
	}



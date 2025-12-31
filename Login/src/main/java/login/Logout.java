package login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logouturl")
public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter po=resp.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, resp);
		
		HttpSession session=req.getSession();
		session.invalidate(); 
		po.println("<h3 style=\"color:green;text-align:center\">You have sucseefully log out </h3>");

	}

}

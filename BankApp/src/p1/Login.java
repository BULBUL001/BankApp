package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private boolean status;
	private String accntnum;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String cusid = request.getParameter("custid");
			String pwd = request.getParameter("pwd");
			Model m = new Model();
			m.setCusid(cusid);
			m.setPwd(pwd);
			
			status = m.logIn();
			HttpSession session = request.getSession(true);
			if(status == true)
			{
				accntnum = m.getAccntnum();
				session.setAttribute("accntnum", accntnum);
				response.sendRedirect("/BankApp/home.jsp");
			}
			else
			{
				response.sendRedirect("/BankApp/loginfail.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

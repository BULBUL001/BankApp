package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChangePwd extends HttpServlet {
	private HttpSession session;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String npwd = request.getParameter("npwd");
			session = request.getSession();
			String accntnum = (String)session.getAttribute("accntnum");
			Model m = new Model();
			m.setAccntnum(accntnum);
			m.setPwd(npwd);
			boolean status = m.changePwd();
			if(status == true)
			{
				response.sendRedirect("/BankApp/changesuccess.jsp");
			}
			else
			{
				response.sendRedirect("/BankApp/changefail.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
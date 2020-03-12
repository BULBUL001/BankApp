package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Transfer
 */
public class Transfer extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			HttpSession session = request.getSession();
			String accntnum =(String) session.getAttribute("accntnum");
			String taccntnum = request.getParameter("taccntnum");
			String tamt = request.getParameter("tamt");
			Model m = new Model();
			m.setTamt(tamt);
			m.setAccntnum(accntnum);
			m.setTaccntnum(taccntnum);
			boolean status = m.transferAmt();
			if(status == true)
			{
				response.sendRedirect("/BankApp/transfersuccess.jsp");
			}
			else
			{
				response.sendRedirect("/BankApp/transferfail.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}
}

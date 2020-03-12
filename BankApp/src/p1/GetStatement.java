package p1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetStatement extends HttpServlet {
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)  {
		try {
			HttpSession session = request.getSession();
			String accntnum = (String)session.getAttribute("accntnum");
			Model m = new Model();
			m.setAccntnum(accntnum);
			ArrayList al = new ArrayList();
			al = m.getStatement();
			if(al.isEmpty()==true)
			{
				response.sendRedirect("/BankApp/notransaction.jsp");
			}
			else
			{
				session.setAttribute("al", al);
				response.sendRedirect("/BankApp/transaction.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

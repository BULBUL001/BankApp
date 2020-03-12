package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Balance extends HttpServlet {
	private String balance;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response){
		try {
			HttpSession session = request.getSession();
			String accntnum = (String) session.getAttribute("accntnum");
			Model m = new Model();
			m.setAccntnum(accntnum);
			boolean status = m.checkBalance();
			if(status==true)
			{
				balance = m.getBalance();
				session.setAttribute("balance", balance);
				response.sendRedirect("/BankApp/balance.jsp");
			}
			else
			{
				response.sendRedirect("/BankApp/balancefail.jsp");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
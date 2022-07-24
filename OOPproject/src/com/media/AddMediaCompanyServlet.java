package com.media;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/AddMediaCompanyServlet")
public class AddMediaCompanyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String location = request.getParameter("place");
		String phone = request.getParameter("phone");
		
		
		boolean isTrue = MediaDBUtil.insertMedia(code, name, email, location, phone);
		
		if(isTrue == true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("InsertSuccess.jsp");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("InsertUnsuccess.jsp");
			req.forward(request, response);
		}
	}

}

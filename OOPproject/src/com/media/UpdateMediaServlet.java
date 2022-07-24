package com.media;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateMediaServlet")
public class UpdateMediaServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id = request.getParameter("id");
		String code = request.getParameter("mediacode");
		String name = request.getParameter("mname");
		String email = request.getParameter("mail");
		String location = request.getParameter("place");
		String phone = request.getParameter("number");
		
		boolean isTrue = MediaDBUtil.updateMedia(id, code, name, email, location, phone);
		
		if(isTrue == true)
		{
			List<Media> medDetails = MediaDBUtil.getMediaDetails(id);
			request.setAttribute("medDetails",medDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("MediaProfile.jsp");
			dis.forward(request, response);
		}
		else
		{
			List<Media> medDetails = MediaDBUtil.getMediaDetails(id);
			request.setAttribute("medDetails",medDetails);
			RequestDispatcher dis = request.getRequestDispatcher("MediaProfile.jsp");
			dis.forward(request, response);
		}
	}

}

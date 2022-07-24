package com.media;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteMediaServlet")
public class DeleteMediaServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id = request.getParameter("id");
		boolean tru = MediaDBUtil.deleteMedia(id);
		
		if(tru == true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("AddMedia.jsp");
			rd.forward(request, response);
		}
		
		else
		{
			List<Media> medDetails = MediaDBUtil.getMediaDetails(id);
			request.setAttribute("medDetails", medDetails);
			
			RequestDispatcher rd = request.getRequestDispatcher("MediaProfile.jsp");
			rd.forward(request, response);
		}
	}

}

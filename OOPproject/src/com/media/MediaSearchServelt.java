package com.media;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MediaSearchServelt")
public class MediaSearchServelt extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pri = response.getWriter();
		response.setContentType("text/html");
		
		String mediacode = request.getParameter("mcode");
		String medianame = request.getParameter("mname");
		boolean isTrue = MediaDBUtil.validate(mediacode, medianame);
		
		if(isTrue == true)
		{
			List<Media> medDetails = MediaDBUtil.getDetails(mediacode);
			request.setAttribute("medDetails", medDetails);
			
			RequestDispatcher rd = request.getRequestDispatcher("MediaProfile.jsp");
			rd.forward(request, response);
		}
		
		else
		{
			pri.println("<script type='text/javascript'>");
			pri.println("alert('The entered mediacode or medianame is incorrect');");
			pri.println("location='MediaSearch.jsp'");
			pri.println("</script>");
		}
		
		/*RequestDispatcher r = request.getRequestDispatcher("Add Media.jsp");
		r.forward(request, response);*/
	}
}

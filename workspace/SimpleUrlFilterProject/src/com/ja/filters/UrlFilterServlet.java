package com.ja.filters;

import java.io.IOException;
import java.util.Arrays;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlFilterServlet
 */
@WebServlet("/UrlFilterServlet")
public class UrlFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String[] sites= {"www.youtube.com", "www.facebook.com", "www.cnn.com"};
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Url = request.getParameter("Url");
		boolean contains = Arrays.asList(sites).contains(Url);
		if (contains){ 
			PrintWriter writer = response.getWriter();
        	writer.println(Url + " is not safe");
        	writer.flush();
		} else {
			response.sendRedirect("http://" + Url);	
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Url = request.getParameter("Url");
		boolean contains = Arrays.asList(sites).contains(Url);
		if (contains){ 
			PrintWriter writer = response.getWriter();
        	writer.println(Url + " is not safe");
        	writer.flush();
		} else {
			response.sendRedirect("http://" + Url);	
		}
	}

}


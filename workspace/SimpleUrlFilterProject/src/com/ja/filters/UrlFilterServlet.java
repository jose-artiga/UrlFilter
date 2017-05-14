package com.ja.filters;

import java.io.IOException;
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Url = request.getParameter("Url");
		PrintWriter writer = response.getWriter();
        writer.println(Url);
        writer.flush();
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Url = request.getParameter("Url");
		PrintWriter writer = response.getWriter();
        writer.println(Url);
        writer.flush();
		/*doGet(request, response);*/
	}

}

package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContextExample")
public class ServletContextExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletContextExample() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("driver");
		out.print("drive is:" + driver);
	}
}

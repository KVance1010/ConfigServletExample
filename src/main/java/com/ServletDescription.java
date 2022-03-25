package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/ServletDescription" }, initParams = {
		@WebInitParam(name = "emailid", value = "servlet@gmail.com") })
public class ServletDescription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletDescription() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String email = config.getInitParameter("emailid");
		out.print("email is:" + email);
//		PrintWriter out = response.getWriter();
//		ServletConfig config = getServletConfig();
//		String email = config.getInitParameter("emailid");
//		out.print("email is: " + email);
	}
}

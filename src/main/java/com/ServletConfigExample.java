package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletConfigExample")
public class ServletConfigExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletConfigExample() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		String email = config.getInitParameter("email");
		out.print("email is:" + email);
		
	}

}

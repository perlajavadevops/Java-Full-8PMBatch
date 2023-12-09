package com.pgr.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.pgr.dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");// MIME
		String userName = request.getParameter("userName");
		String pass = request.getParameter("password");

		LoginDao dao = new LoginDao();
		if (dao.validateLoginDetails(userName, pass)) {// true
			/*
			 * pw.println("<html><b>Hello First HTML With Servlet...</b>");
			 * pw.println("<b>User Name: " + userName + "</b>"); pw.println("<b>Password: "
			 * + pass + "</b></html>");
			 */
			RequestDispatcher rd = request.getRequestDispatcher("/welcome");
			rd.forward(request, response);
		} else {

			pw.println("<html><b>Invalid User name and password...</b></html>");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}

		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");// MIME
		String userName = request.getParameter("userName");
		String pass = request.getParameter("password");

		LoginDao dao = new LoginDao();
		if (dao.validateLoginDetails(userName, pass)) {// true
			/*
			 * pw.println("<html><b>Hello First HTML With Servlet...</b>");
			 * pw.println("<b>User Name: " + userName + "</b>"); pw.println("<b>Password: "
			 * + pass + "</b></html>");
			 */
			
			ServletConfig config = getServletConfig();
			
			String dbUser = config.getInitParameter("dbUser");
			pw.print("db User:: "+dbUser);
			
			ServletContext sContext = getServletContext();
			
			String contextName = sContext.getInitParameter("contextName");
			pw.print("contextName User:: "+contextName);
			request.setAttribute("userName", userName);
			request.setAttribute("password", pass);
			RequestDispatcher rd = request.getRequestDispatcher("/welcome");
			rd.include(request, response);
		} else {

			pw.println("<html><b>Invalid User name and password...</b></html>");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		pw.close();
	}

}

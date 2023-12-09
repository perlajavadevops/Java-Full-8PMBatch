package com.pgr.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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

		pw.println("<html><b>Hello First HTML With Servlet...</b>");
		pw.println("<b>User Name: " + userName + "</b>");
		pw.println("<b>Password: " + pass + "</b></html>");

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

		pw.println("<html><b>Hello First HTML With Servlet...</b>");
		pw.println("<b>User Name: " + userName + "</b>");
		pw.println("<b>Password: " + pass + "</b></html>");

		pw.close();
	}

}

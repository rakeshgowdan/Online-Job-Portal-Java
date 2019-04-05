package com.niit.Credentials;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Credentials.dao.LoginDao;

@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		System.out.println(email);
		System.out.println(pass);
		  HttpSession session = request.getSession();
			session.setAttribute("username", email);
		LoginDao dao = new LoginDao();
		if (dao.validate(email, pass)) {
			
			if (email.equals("HR.admin@jobportal.com")) {
				RequestDispatcher dd = request.getRequestDispatcher("Admin.jsp");
				dd.forward(request, response);

			} else {
				response.sendRedirect("ApplicantPage.jsp");
			}

		} else if (email != "" && pass != "") {
			RequestDispatcher d = request.getRequestDispatcher("/HomePage.html");
			p.println("<script type=\"text/javascript\">");
			p.println("alert('Incorrect LogIn ID');");
			p.println("</script>");

			d.include(request, response);

		} else {
			RequestDispatcher d = request.getRequestDispatcher("HomePage.html");
			d.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
}
}
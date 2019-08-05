package com.niit.Credentials;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Credentials.dao.AddJobDao;

@WebServlet("/AddJob")
public class AddJob extends HttpServlet {

	public AddJob() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("AddJob Called:: Servlet");
		AddJobDao dao = new AddJobDao();
		PrintWriter p = response.getWriter();
		String s1 = request.getParameter("loc");
		String s2 = request.getParameter("area");
		String s3 = request.getParameter("key");
		String s4 = request.getParameter("vac");
		String s5 = request.getParameter("sal");
		String s6 = request.getParameter("ivdt");
		String s7 = request.getParameter("ivt");
		String s8 = request.getParameter("ivp");
		String s9 = request.getParameter("skill");
		HttpSession session = request.getSession(false);
		String s10 = (String) session.getAttribute("username");
		System.out.println(s10);
		System.out.println(s1 + "" + s2 + "" + s3 + "" + s4 + "" + s5 + "" + s6 + "" + s7 + "" + s8 + "" + s9);
		if (s1 != null && s2 != null && s3 != null && s4 != null && s5 != null && s6 != null && s7 != null && s8 != null
				&& s9 != null && s10 != null) {
			System.out.println("Dao.update called");
			if (dao.update(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10) == 1) {

				p.println("<script>alert('Job Addedd SUccessfully.')</script>");
				response.setHeader("Refresh", "1;AddJobs.jsp");
			} else {
				p.println("<script>alert('Job Post Failed!! Try Again')</script>");
				response.setHeader("Refresh", "1;AddJobs.jsp");
			}
			//p.println("something went wrong");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

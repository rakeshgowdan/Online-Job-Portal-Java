package com.niit.JobPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.JobBean.TotalApplication;
import com.niit.JobBean.dao.JobDao;

@WebServlet("/UpdateApplications")
public class UpdateApplications extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		String Jpost=request.getParameter("id");
		String Company=request.getParameter("comp");
		System.out.println(Jpost);
		System.out.println(Company);
		PrintWriter p = response.getWriter();
		JobDao d=new JobDao();
		if(d.updateApprove(Jpost, Company)==1) {
			p.println("<script>alert('Approve  Successfully.')</script>");
			response.setHeader("Refresh", "1;Admin.jsp");
		}
		else
		{
			p.println("<script>alert('Approve failed')</script>");
			response.setHeader("Refresh", "1;AppliedJobs.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}

}

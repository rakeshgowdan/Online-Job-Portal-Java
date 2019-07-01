package com.niit.JobPost;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.JobBean.Job;
import com.niit.JobBean.dao.JobDao;


@WebServlet("/AppliedJob")
public class AppliedJob extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Jpost=request.getParameter("id");
		String Company=request.getParameter("comp");
		System.out.println("id"+Jpost);
		System.out.println("c-mail"+Company);
		try {Job Ajobs =JobDao.applylist(Jpost, Company);
		 request.setAttribute("ApplyJobList",Ajobs);
		 request.getRequestDispatcher("Apply.jsp").forward(request, response);
	}
		catch (SQLException e) {System.out.println(e);}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}

}

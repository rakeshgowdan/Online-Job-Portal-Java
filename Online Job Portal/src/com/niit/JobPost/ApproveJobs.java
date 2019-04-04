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
import com.niit.JobBean.TotalApplication;
import com.niit.JobBean.dao.JobDao;


@WebServlet("/ApproveJobs")
public class ApproveJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		 List<TotalApplication> TotalJ =JobDao.appliedJobs();
		 request.setAttribute("TotalJobs",TotalJ);
		 request.getRequestDispatcher("AppliedJobs.jsp").forward(request, response);
		 
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}

}

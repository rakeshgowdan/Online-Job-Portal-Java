package com.niit.JobPost;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.niit.JobBean.Job;
import com.niit.JobBean.dao.JobDao;


@WebServlet("/Jobs")
public class Jobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		System.out.println("jobs servlet called");
		 try {List<Job> jobs =JobDao.list();
		 request.setAttribute("JobList",jobs);
		 System.out.println("list loading done");
		 request.getRequestDispatcher("JobApply.jsp").forward(request, response);
		 
		 } catch (SQLException e) {System.out.println(e);}
		 
		 
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

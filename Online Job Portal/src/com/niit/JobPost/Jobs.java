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


@WebServlet("/Jobs")
public class Jobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	    private JobDao JD=new JobDao();
    public Jobs() { super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
			 System.out.println("servlet called");
	            List<Job>  J= JD.list();
	            System.out.println(JD.list());
	            request.setAttribute("Jobs", J); // Will be available as ${jobs} in JSp
	            request.getRequestDispatcher("JobApply.jsp").forward(request, response);
	        } catch (SQLException e) {
	            throw new ServletException("Cannot obtain products from DB", e);
	        }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

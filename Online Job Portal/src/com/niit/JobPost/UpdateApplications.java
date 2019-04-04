package com.niit.JobPost;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.JobBean.dao.JobDao;

@WebServlet("/UpdateApplications")
public class UpdateApplications extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		String value="";
		String v[]=request.getParameterValues("Approved");
		System.out.println(v);
		JobDao d=new JobDao();
		for(int i=0;i<v.length;i++) {
			value=v[i];
			d.updateApprove(value);
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}

}

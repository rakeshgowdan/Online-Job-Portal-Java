package com.niit.JobPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.niit.JobBean.dao.JobDao;

@WebServlet("/SubmitJob")
public class SubmitJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String CompanyName=request.getParameter("Cname");
		String JobPost=request.getParameter("Jpost");
		String Email=request.getParameter("email");
		String FullName=request.getParameter("Fname");
		String MobileNo=request.getParameter("Mno");
		String Skills=request.getParameter("skill");
		
		JobDao d=new JobDao();
		PrintWriter p = response.getWriter();
		if(d.applyToJob(CompanyName,JobPost,Email,FullName,MobileNo,Skills)==1) {
	 		response.sendRedirect("ApplicantPage.jsp");
	 		JOptionPane.showMessageDialog(null,"Applied Successfully");
	 	}else {
	 		p.println("<script type=\"text/javascript\">"); 
			p.println("alert(\"Job Apply failed\")");
			p.println("</script>");
			response.sendRedirect("ApplicantPage.jsp");
	 		
	 	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}

}

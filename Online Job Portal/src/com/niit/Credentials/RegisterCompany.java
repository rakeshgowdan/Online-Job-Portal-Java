package com.niit.Credentials;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Credentials.dao.RegisterCompanyDao;

@WebServlet("/RegisterCompany")
public class RegisterCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterCompany() {super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegisterCompanyDao dao=new RegisterCompanyDao();
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");

			String s1=request.getParameter("username");
			String s2=request.getParameter("passwd");
			String s3=request.getParameter("web");
			String s4=request.getParameter("mail");
			if(s1!=null && s2!=null && s3!=null )
			{
				if(dao.update(s1,s2,s3,s4)==1) {
					p.println("<script>alert('Registration Successfull.')</script>");
				response.setHeader("Refresh","1;CompanyLogin.jsp");
				}
				else {
					p.println("<script type=\"text/javascript\">"); 
					p.println("alert(\"Registration failed\")");
					p.println("</script>");
					 }
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.niit.Credentials;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.Credentials.dao.EmployeeDAO;


@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	
    public RegisterUser() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		String Uemail = request.getParameter("email");
	 	String Ufname = request.getParameter("firstName");
	 	String Ulname = request.getParameter("lastName");
	 	String UserName = request.getParameter("userName");
	 	String Password = request.getParameter("passwd");
	 	String gen = request.getParameter("gender");
	 	String exp =request.getParameter("exp_in_years");
	 	String PI =request.getParameter("industry");
	 	String skill=request.getParameter("keySkills");
	 	
	 	EmployeeDAO dao=new EmployeeDAO();
	 	if(dao.save(Uemail,Ufname,Ulname,UserName,Password,gen,exp,PI,skill)==1) {
	 		p.println("<script>alert('User Registered  Successfully.')</script>");
			response.setHeader("Refresh", "1;HomePage.html");
	 	}else {
	 		p.println("<script type=\"text/javascript\">"); 
			p.println("alert(\"Registration failed\")");
			p.println("</script>");
	 		
	 	}
	}

	
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.niit.Credentials;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Credentials.dao.EmployeeDAO;
import com.niit.EmployeeBean.Employee;
import java.io.PrintWriter;
@WebServlet("/UpdatedUser")
public class UpdatedUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Updated user Servlet called");
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        HttpSession session=request.getSession(); 
        String Umail=(String)session.getAttribute("username");
          System.out.println("Email SO :: "+Umail);
        String Uemail = request.getParameter("E-mail");
	 	String Ufname = request.getParameter("FirstName");
	 	String Ulname = request.getParameter("LastName");
	 	String UserName = request.getParameter("UserName");
	 	String Password = request.getParameter("Password");
	 	String gen = request.getParameter("Gender");
	 	String exp =request.getParameter("Expirence");
	 	String PI =request.getParameter("PreferedIndustry");
	 	String skill=request.getParameter("KeySkills");
     
        Employee e=new Employee();  
        e.setUemail(Uemail);
        e.setUfname(Ufname);
        e.setUlname(Ulname);
        e.setUserName(UserName);
        e.setPassword(Password);
        e.setGen(gen);
        e.setExp(exp);
        e.setPI(PI);
        e.setSkill(skill);
          System.out.println("Updated user info:: "+e);
        int status=EmployeeDAO.update(e,Umail);  
        if(status>0){ 
        out.println("<script>alert('Profile Updated Successfully.')</script>");
		response.setHeader("Refresh", "1;ApplicantPage.jsp");
        }
        else{  
        out.println("<script>alert('Sorry! unable to update Deatils')</script>");
        response.setHeader("Refresh", "1;ApplicantPage.jsp");
        }  
        out.close();  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}
}

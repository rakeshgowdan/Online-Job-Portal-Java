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
		System.out.println("updatd user called");
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        HttpSession session=request.getSession(); 
        String Umail=(String)session.getAttribute("EMAIL");
          
        String Uemail = request.getParameter("email");
	 	String Ufname = request.getParameter("firstName");
	 	String Ulname = request.getParameter("lastName");
	 	String UserName = request.getParameter("userName");
	 	String Password = request.getParameter("passwd");
	 	String gen = request.getParameter("gender");
	 	String exp =request.getParameter("exp_in_years");
	 	String PI =request.getParameter("industry");
	 	String skill=request.getParameter("keySkills");
          
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
          
        int status=EmployeeDAO.update(e,Umail);  
        if(status>0){   response.sendRedirect("ApplicantPage.jsp");  }
        else{  out.println("Sorry! unable to update Deatils"); }  
        out.close();  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}
}

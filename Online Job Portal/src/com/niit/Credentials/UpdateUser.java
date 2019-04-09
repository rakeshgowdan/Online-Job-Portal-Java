package com.niit.Credentials;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.Credentials.dao.EmployeeDAO;
import com.niit.EmployeeBean.Employee;


@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Info</h1>");  
        HttpSession session=request.getSession(); 
        String Umail=(String)session.getAttribute("username");
      
          
        Employee e=EmployeeDAO.getEmployeeById(Umail);  
          
        out.print("<form action='UpdatedUser' method='POST'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='E-mail' value='"+e.getUemail()+"'/></td></tr>");  
        out.print("<tr><td>FirstName:</td><td><input type='text' name='FirstName' value='"+e.getUfname()+"'/></td></tr>");  
        out.print("<tr><td>LastName:</td><td><input type='text' name='LastName' value='"+e.getUlname()+"'/></td></tr>");  
        out.print("<tr><td>UserName:</td><td><input type='text' name='UserName' value='"+e.getUserName()+"'/></td></tr>");  
        out.print("<tr><td>password:</td><td><input type='password' name='Password' value='"+e.getPassword()+"'/></td></tr>");  
        out.print("<tr><td>Gender:</td><td><input type='text' name='Gender' value='"+e.getGen()+"'/></td></tr>");  
        out.print("<tr><td>Expirence:</td><td><input type='text' name='Expirence' value='"+e.getExp()+"'/></td></tr>");  
        out.print("<tr><td>PreferedIndustry:</td><td><input type='text' name='PreferedIndustry' value='"+e.getPI()+"'/></td></tr>");
        out.print("<tr><td>KeySkills:</td><td><input type='text' name='KeySkills' value='"+e.getSkill()+"'/></td></tr>");
        
        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Update'/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");   
        out.close();  
    } 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {doGet(request, response);}
}

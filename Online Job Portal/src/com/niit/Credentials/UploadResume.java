package com.niit.Credentials;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.niit.Credentials.dao.EmployeeDAO;

import java.io.InputStream;
import java.io.PrintWriter;
@WebServlet("/UploadResume")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class UploadResume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   PrintWriter out=response.getWriter();  
		System.out.println(" Upload Resume servlet called");
		 HttpSession session=request.getSession(); 
	     String email=(String)session.getAttribute("username");
		InputStream inputStream = null; // input stream of the upload file
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("filename");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
            
            EmployeeDAO d=new EmployeeDAO();
            if(d.uploadResume(email, inputStream)==1)
            {
              	
            	 out.println("<script>alert('Resume Uploaded Successfully.')</script>");
         		response.setHeader("Refresh", "1;ApplicantPage.jsp");
            }
            
        }
         
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

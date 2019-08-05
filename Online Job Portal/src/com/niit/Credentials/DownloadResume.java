package com.niit.Credentials;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Blob;
import java.sql.SQLException;

import com.niit.Credentials.dao.EmployeeDAO;


@WebServlet("/DownloadResume")
public class DownloadResume extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	

		
		
		
		String email=request.getParameter("id");
		System.out.println(email);
		EmployeeDAO d=new EmployeeDAO();
		try {
        Blob fileData = d.downloadResume(email);
        String contentType = this.getServletContext().getMimeType("resume");
        System.out.println("Content Type: " + contentType);
        response.setContentType("APPLICATION/OCTET-STREAM");   
        response.setHeader("Content-Type", contentType);
        response.setHeader("Content-Length", String.valueOf(fileData.length()));
        response.setHeader("Content-Disposition", "inline; filename=\"" +" resume"+ "\"");
        System.out.println(fileData);
        if(fileData!=null) {
        InputStream is = fileData.getBinaryStream();
        byte[] bytes = new byte[1024];
        int bytesRead;

        while ((bytesRead = is.read(bytes)) != -1) {
            // Write image data to Response.
            response.getOutputStream().write(bytes, 0, bytesRead);
        }
        is.close();
        }
		}
		catch(SQLException e) { System.out.println(e);}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

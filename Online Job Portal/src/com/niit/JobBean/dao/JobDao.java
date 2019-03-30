package com.niit.JobBean.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.niit.JobBean.Job;
import com.niit.SqlConnect.SqlConnection;

import java.sql.*;

public class JobDao {

	static Connection con = null;

	public  static List<Job> list() throws SQLException {
		
	        List<Job> jobs = new ArrayList<Job>();
             System.out.println("job dao called");
	        try {
	            con=SqlConnection.dbConnector();
	            Statement statement = con.createStatement();
	            ResultSet resultSet = statement.executeQuery("select * from jobs");
	            
	            while (resultSet.next())
	            {
	                Job j = new Job();
	                j.setLocation(resultSet.getString("Location"));
	                j.setFarea(resultSet.getString("Functional Area"));
	                j.setJpost(resultSet.getString("Job Post"));
	                j.setVacancy(resultSet.getInt("Vacany"));
	                j.setSalary(resultSet.getString("Salary"));
	                j.setIdate(resultSet.getString("Interview Data"));
	                j.setItime(resultSet.getString("Interview Time"));
	                j.setIplace(resultSet.getString("Interview Place"));
	                j.setSkills(resultSet.getString("Skills"));
	                jobs.add(j);
	                System.out.println("DAO::list added in dao");
	            }
	            System.out.println(jobs);
		        return jobs;
	        }
	        catch(Exception e) {
	        	System.out.println(e);
	        }
			return null;
          
	    }
	        

	}
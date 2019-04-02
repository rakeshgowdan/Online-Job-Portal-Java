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

	public static List<Job> list() throws SQLException {

		List<Job> jobs = new ArrayList<Job>();
		try {
			con = SqlConnection.dbConnector();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from jobs");

			while (resultSet.next()) {
				Job j = new Job();
				j.setLocation(resultSet.getString("Location"));
				j.setFarea(resultSet.getString("FunctionalArea"));
				j.setJpost(resultSet.getString("JobPost"));
				j.setVacancy(resultSet.getInt("Vacany"));
				j.setSalary(resultSet.getString("Salary"));
				j.setIdate(resultSet.getString("Interview Data"));
				j.setItime(resultSet.getString("Interview Time"));
				j.setIplace(resultSet.getString("Interview Place"));
				j.setSkills(resultSet.getString("Skills"));
				j.setCompany(resultSet.getString("CompanyName"));
				jobs.add(j);
				
			}
			return jobs;
		} catch (Exception e) {System.out.println(e);}
		return null;

	}
	public  static Job applylist(String post,String company) throws SQLException {
		try {
			con = SqlConnection.dbConnector();
			PreparedStatement  statement = con.prepareStatement("select * from jobs where JobPost=? and CompanyName=?");
			statement.setString(1, post);
			statement.setString(2, company);
			ResultSet resultSet = statement.executeQuery();
			
			Job j = new Job();
			while (resultSet.next()) {
				j.setJpost(resultSet.getString("JobPost"));
				j.setCompany(resultSet.getString("CompanyName"));
			
			}
			return j;
		} catch (Exception e) {System.out.println(e);}
		
		return null;}
}
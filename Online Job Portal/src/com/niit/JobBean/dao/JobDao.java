package com.niit.JobBean.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.niit.JobBean.Job;
import com.niit.JobBean.TotalApplication;
import com.niit.SqlConnect.SqlConnection;

import java.sql.*;

public class JobDao {

	static Connection con = null;

	public static List<Job> list() throws SQLException {

		List<Job> jobs = new ArrayList<Job>();
		try {
			con = SqlConnection.dbConnector();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from jobpost");

			while (resultSet.next()) {
				Job j = new Job();
				j.setLocation(resultSet.getString("Location"));
				j.setFarea(resultSet.getString("FunctionalArea"));
				j.setJpost(resultSet.getString("JobPost"));
				j.setVacancy(resultSet.getInt("Vacany"));
				j.setSalary(resultSet.getString("Salary"));
				j.setIdate(resultSet.getString("interviewDate"));
				j.setItime(resultSet.getString("interviewTime"));
				j.setIplace(resultSet.getString("interviewPlace"));
				j.setSkills(resultSet.getString("Skill"));
				j.setCompany(resultSet.getString("email"));
				jobs.add(j);
				
			}
			return jobs;
		} catch (Exception e) {System.out.println(e);}
		return null;

	}
	public  static Job applylist(String post,String company) throws SQLException {
		try {
			con = SqlConnection.dbConnector();
			PreparedStatement  statement = con.prepareStatement("select * from jobpost where JobPost=? and email=?");
			statement.setString(1, post);
			statement.setString(2, company);
			ResultSet resultSet = statement.executeQuery();
			
			Job j = new Job();
			while (resultSet.next()) {
				j.setJpost(resultSet.getString("jobpost"));
				j.setCompany(resultSet.getString("email"));
			
			}
			return j;
		} catch (Exception e) {System.out.println(e);}
		
		return null;}
	
	public int applyToJob(String CompanyName,String JobPost,String Email,String FullName, String MobileNo,String Skills) {
		try {
			con = SqlConnection.dbConnector();
			String query = "INSERT INTO appliedjobs VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			String Applied="yes";
			String Approved="NO";
			st.setString(1, CompanyName);
			st.setString(2, JobPost);
			st.setString(3, Email);
			st.setString(4, FullName);
			st.setString(5, MobileNo);
			st.setString(6, Skills);
			st.setString(7, Applied);
			st.setString(8, Approved);
			int i = st.executeUpdate();
			return i;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public static List<TotalApplication>appliedJobs() {
		List<TotalApplication> TA = new ArrayList<TotalApplication>();
		try {
			con = SqlConnection.dbConnector();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from appliedjobs");

			while (resultSet.next()) {
				TotalApplication t = new TotalApplication();
				t.setCompanyName(resultSet.getString("CompanyName"));
				t.setJobPost(resultSet.getString("JobPost"));
				t.setEmail(resultSet.getString("Email"));
				t.setFullName(resultSet.getString("FullName"));
				t.setMobileNo(resultSet.getString("MobileNo"));
				t.setSkills(resultSet.getString("Skills"));
				t.setApplied(resultSet.getString("Applied"));
				t.setApproved(resultSet.getString("Approved"));
				//t.setId(resultSet.getString("jobId"));
				System.out.println(t);
			    TA.add(t);
			}
		   return TA;
		} catch (Exception e) {System.out.println(e);}
		return null;
		
	}

public   int updateApprove(String jpost,String Company) {
	try {
		con=SqlConnection.dbConnector();
		String Query="UPDATE appliedjobs SET Approved =? where JobPost=? and CompanyName=? ";
	    String approve="YES";
		PreparedStatement st = con.prepareStatement(Query);
		st.setString(1, approve);
		st.setString(2, jpost);
		st.setString(3, Company);
		int i = st.executeUpdate();
		return i;
	}
 catch (Exception e) {System.out.println(e);}
	return 0;
	}

}
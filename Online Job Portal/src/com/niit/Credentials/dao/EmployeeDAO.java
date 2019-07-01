package com.niit.Credentials.dao;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.niit.EmployeeBean.Employee;
import com.niit.SqlConnect.SqlConnection;

public class EmployeeDAO {

	static Connection con = null;

	public int save(String Uemail, String Ufname, String Ulname, String UserName, String Password, String gen,
			String exp, String PI, String skill) {
		try {
			con = SqlConnection.dbConnector();
			String query = "insert into employee values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			
			st.setString(1, Uemail);
			st.setString(2, Ufname);
			st.setString(3, Ulname);
			st.setString(4, UserName);
			st.setString(5, Password);
			st.setString(6, gen);
			st.setString(7, exp);
			st.setString(8, PI);
			st.setString(9, skill);
			st.setString(10, null);
			int i = st.executeUpdate();
			return i;
		} catch (SQLException e) {
			System.out.println(e);
		}
		return 0;
	}

	public static int update(Employee e, String Umail) {
		int status = 0;

		try {
			System.out.println("mail from DAO"+Umail);

			con = SqlConnection.dbConnector();
			PreparedStatement st = con.prepareStatement(
					"UPDATE employee SET FirstName= ?, LastName=?, UserName=?, Password=?, Gender= ?, Expirence = ?,  Industry= ?, keySkills =? WHERE email =? ");
			st.setString(1, e.getUfname());
			st.setString(2, e.getUlname());
			st.setString(3, e.getUserName());
			st.setString(4, e.getPassword());
            st.setString(5, e.getGen());
			st.setString(6, e.getExp());
			st.setString(7, e.getPI());
			st.setString(8, e.getSkill());
			st.setString(9, Umail);
			status = st.executeUpdate();
			if (status > 0) {
				System.out.println("updated success");
			}
			return status;
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return 0;
	}

	public static Employee getEmployeeById(String Uemail) {
		Employee e = new Employee();
	
		try {
			con = SqlConnection.dbConnector();
			PreparedStatement ps = con.prepareStatement("select * from employee where  email=?");
			ps.setString(1, Uemail);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e.setUemail(rs.getString((1)));
				e.setUfname(rs.getString(2));
				e.setUlname(rs.getString(3));
				e.setUserName(rs.getString(4));
				e.setPassword(rs.getString(5));
				e.setGen(rs.getString(6));
				e.setExp(rs.getString(7));
				e.setPI(rs.getString(8));
				e.setSkill(rs.getString(9));
				System.out.println("Get emp by id"+e);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return e;
	}

	public  int uploadResume(String email,InputStream resume) {
		
			int status = 0;
		try {
			System.out.println(email);
		
			con = SqlConnection.dbConnector();
			PreparedStatement st = con.prepareStatement("UPDATE employee SET resume=? WHERE email =?");
			
			st.setBlob(1, resume);
			st.setString(2, email);
			status = st.executeUpdate();
		  return status;
		  }
		catch(Exception e) {System.out.println(e);}
		return 0;
		}
	
	public Blob downloadResume(String Email) {
		try {
			
			System.out.println("download resume called");
		System.out.println("DR1::"+Email);
			con = SqlConnection.dbConnector();
			PreparedStatement st = con.prepareStatement("select resume from employee where email=?");
			st.setString(1, Email);
			
			ResultSet result = st.executeQuery();
			System.out.println(result);
			if(result.next()) {
		    Blob EResume = result.getBlob("resume");
		    System.out.println("DR2::"+Email);
		    return EResume;
			}
		    
		           
			}
		catch(Exception e) {
			
		}
		return null;

		
	}
}

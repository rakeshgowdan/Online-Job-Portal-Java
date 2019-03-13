 package com.niit.Credentials.dao;

import java.sql.*;

import com.niit.SqlConnect.SqlConnection;
public class RegisterUserDao {
	
	Connection con=null;
	public  int update(String Uemail,String Ufname,String Ulname, String UserName, String Password,String gen,String exp,String PI,String skill) {
		try {
			con=SqlConnection.dbConnector();
			String query = "INSERT INTO candidates VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = con.prepareStatement(query);	
			st.setString(1,Uemail);
			st.setString(2,Ufname);
			st.setString(3,Ulname);
			st.setString(4, UserName);
			st.setString(5,Password);
			st.setString(6, gen);
			st.setString(7,exp);
			st.setString(8, PI);
			st.setString(9, skill);
			int i=st.executeUpdate();
			return i;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
		
		
	}

}

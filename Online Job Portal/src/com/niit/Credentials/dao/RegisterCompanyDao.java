package com.niit.Credentials.dao;
 
import java.sql.*;

import com.niit.SqlConnect.SqlConnection;
public class RegisterCompanyDao {
	Connection con=null;
	public int update(String s1,String s2,String s3,String s4) {
		con=SqlConnection.dbConnector();
		String query = "INSERT INTO companies VALUES (?,?,?,?)";
		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			st.setString(1,s1);
			st.setString(2,s4);
			st.setString(3,s2);
			st.setString(4, s3);
			int i=st.executeUpdate();
			return i;
		} catch (SQLException e) {e.printStackTrace();}
		return 0;
		
	}

}

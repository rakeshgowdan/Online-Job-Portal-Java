package com.niit.Credentials.dao;

import java.sql.*;

import com.niit.SqlConnect.SqlConnection;

public class CompanyLoginDao {
	String query = "select * from Companies where CompanyEmail=? and Password=?";
	Connection con = null;

	public boolean validate(String E_mail, String pass) {
		try {
			con = SqlConnection.dbConnector();
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, E_mail);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;

	}
}

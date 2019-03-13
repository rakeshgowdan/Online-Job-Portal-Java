package com.niit.Credentials.dao;

import java.sql.* ;

public class AddJobDao {
	
	Connection con=null;
	public int update(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) {
		String query="INSERT INTO jobs (`Location`,`Functional Area`,`Job Post`,`Vacany`,`Salary`,`Interview Data`,`InterView Time`,`Interview Place`.`skills`) VALUES(?,?,?,?,?,?,?,?,?);";	
		try {
			PreparedStatement st= con.prepareStatement(query);
			st.setString(1,s1);
			st.setString(2,s2);
			st.setString(3,s3);
			st.setString(4,s4);
			st.setString(5,s5);
			st.setString(6,s6);
			st.setString(7,s7);
			st.setString(8,s8);
			int i=st.executeUpdate();
			return 1;
		} catch (SQLException e) {e.printStackTrace();}
		return 0;
	}
}

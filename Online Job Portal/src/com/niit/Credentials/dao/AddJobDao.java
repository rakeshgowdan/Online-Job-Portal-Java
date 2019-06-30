package com.niit.Credentials.dao;

import java.sql.* ;

import com.niit.SqlConnect.SqlConnection;

public class AddJobDao {
	
	Connection con=null;
	public int update(String loc,String area,String jobpost,String vac,String salary,String ivdt,String ivt,String ivtp,String skill,String mail) {
		System.out.println("Update Started");
		System.out.println(loc+""+area+""+jobpost+""+vac+""+salary+""+ivdt+""+ivt+""+skill+""+mail);
		con=SqlConnection.dbConnector();
		String query="insert into jobpost values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement st= con.prepareStatement(query);
			System.out.println("PST set");
			st.setString(1,loc);
			st.setString(2,area);
			st.setString(3,jobpost);
			st.setString(4,vac);
			st.setString(5,salary);
			st.setString(6,ivdt);
			st.setString(7,ivt);
			st.setString(8,ivtp);
			st.setString(9,skill);
			st.setString(10, mail);
			System.out.println("pst done");
			int i=st.executeUpdate();
			System.out.println("added job::DAo.update");
			return i;
		} catch (SQLException e) {System.out.println(e);System.out.println("something went wrong");}
		return 0;
	}


/*public void AddJobToDB(String loc,String area,String jobpost,String vac,String salary,String ivdt,String ivt,String ivtp,String skill,String mail) {
	System.out.println("AddJobToDB Called");
	System.out.println(loc+""+area+""+jobpost+""+vac+""+salary+""+ivdt+""+ivt+""+skill+""+mail);
	
	String Query="INSERT INTO jobpost (`location`,`FunctionalArea`,`jobpost`,`vacany`,`salary`,`interviewDate`,`interviewTime`,`interviewPlace`,`Skill`,`email`) VALUES (?,?,?,?,?,?,?,?,?,?)";
	
	try {
		PreparedStatement pst=con
		
	}
	catch(SQLException e) {System.out.println(e);	System.out.println("something went wrong");}
	
}*/
}

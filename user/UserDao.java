package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
public void insert (User us) throws ClassNotFoundException, SQLException {
	
		String insertQuery="insert into user_gift(user_name,email,mobile_number,user_Password) values(?,?,?,?)";
		Connection con=UserConnection.gbconnection();
		PreparedStatement pstmt=con.prepareStatement(insertQuery);
		
		
		pstmt.setString(1,us.getUsername());
		pstmt.setString(2,us.getEmail());
		pstmt.setLong(3,us.getMobilenumber());
		pstmt.setString(4,us.getPassword());	
	int i = pstmt.executeUpdate();
	System.out.println(i+"Row inserted");	
    pstmt.close();
	con.close();
	}

public  boolean validateuser(String user_email,String user_password  ) throws ClassNotFoundException, SQLException {
	String  validate="select * from user_gift where email = ? and user_password = ?";
	Connection con=UserConnection.gbconnection();
    PreparedStatement Pstmt1 = con.prepareStatement(validate);
    Pstmt1.setString(1, user_email);
    Pstmt1.setString(2, user_password);
	ResultSet rs = Pstmt1.executeQuery();
	if(rs.next()) {
		return true;
	}
	return false;
}
}

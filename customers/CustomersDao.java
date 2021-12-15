package com.customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.products.ProductConnection;

public class CustomersDao {
	
	public void insert (Customers cu) throws ClassNotFoundException, SQLException {
		String insertQuery="insert into gproducts values(?,?,?,?,?)";
		Connection con=ProductConnection.gbConnection();
		PreparedStatement pstmt=con.prepareStatement(insertQuery);
		pstmt.setInt(1,cu.getCustomerid());
		pstmt.setString(2,cu.getUsername());
		pstmt.setString(3,cu.getPassword());
		pstmt.setString(4,cu.getAddress());
		pstmt.setInt(5,cu.getMobilenumber());
		int i =pstmt.executeUpdate();
		System.out.println(i+"Row inserted");
		pstmt.close();
		con.close();
	}

}

package com.customers;

import java.sql.SQLException;
import java.util.Scanner;

import com.products.Product;

public class Customersmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice press 1 to insert,2 to update,3 to delete");
		int num=input.nextInt();
		CustomersDao ob=new CustomersDao();
		switch(num)
		{
		case 1:
			System.out.println("Enter insert details");
		String s1=input.next();
		Customers cu= new Customers(Integer.parseInt(s1.split(",")[0]),s1.split(",")[1],s1.split(s1)[2],s1.split(",")[3],
				Integer.parseInt(s1.split(",")[4]));
		ob.insert(cu);
		break;
	}

}}
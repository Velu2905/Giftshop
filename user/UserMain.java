package com.user;

import java.sql.SQLException;
import java.util.Scanner;


public class UserMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("\n1.Register\n2.Login\n3.Admin");
		int choice= input.nextInt();
		input.nextLine();
		UserDao ob=new UserDao();
		switch(choice)
		{
		case 1:
			System.out.println("Enter username,email,moile number,");
		String s1=input.next();
		User cu= new User(s1.split(",")[0],s1.split(",")[1],Long.parseLong(s1.split(",")[2]),s1.split(",")[3]);
		ob.insert(cu);
		break;
		case 2:
			   UserDao usdao=new UserDao();
				System.out.println("Enter your register email_id");
				String email=input.nextLine();
				System.out.println("Enter your password");
				String user_password=input.nextLine();
				boolean flag=usdao.validateuser(email, user_password);
						if(flag) {
							System.out.println("Valid input");
						}else {
							System.out.println("invalid input");
						}
				
				break;
				
					
				}


	}
	}



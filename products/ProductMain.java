package com.products;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice press 1 to insert,2 to update,3 to delete");
		int num=input.nextInt();
		
		ProductDao ob=new ProductDao();
		switch(num)
		{
		case 1:
			System.out.println("Enter insert details");
		String s1=input.next();
		Product pr= new Product(Integer.parseInt(s1.split(",")[0]),s1.split(",")[1],s1.split(",")[2],
				Double.parseDouble(s1.split(",")[3]),s1.split(",")[4]);
		ob.insert(pr);
		break;
		case 2:
		System.out.println("Enter your update details-first product name,next Product id ");
		String s2=input.next();
		Product pr1=new Product(s2.split(",")[0] ,Integer.parseInt(s2.split(",")[1]));
		ob.update(pr1);
		}
		
	}  
	}



package com.hexaware.jdbcoperations;

import java.util.Scanner;

public class JDBCUtil {
	
	String choice = null;
	char ch = 'y';
	Scanner sc = new Scanner(System.in);
	JDBCCRUDOperations jdbcOps = new JDBCCRUDOperations();
	public void jdbcTransactions() {
		while(ch=='y') {
			System.out.println("Enter the Database transaction...");
			System.out.println("insert:insert data in to database");
			System.out.println("delete:delete data from database");
			System.out.println("update:update data in the database");
			System.out.println("selectall:select all data from database");
			System.out.println("selectbyid:select data from database with id");
			choice = sc.next();
			switch(choice){
				case "insert":
					jdbcOps.insertCustomer();
					break;
				case "delete":
					jdbcOps.deleteCustomerById();
					break;
				case "update":
					jdbcOps.updateCustomerById();
					break;
				case "selectall":
					jdbcOps.selectAllCustomers();
					break;
				case "selectbyid":
					jdbcOps.selectCustomerById();
					break;
			}
			System.out.println("Do you continue (y/n).....");
			ch = sc.next().charAt(0);
		}
	

	}

}

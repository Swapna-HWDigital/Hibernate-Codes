package com.hexaware.jdbcoperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.dbconnection.DBConnection;

/**
 * @author Swapna
 *
 */

public class JDBCCRUDOperations {
	static public Connection conn = null;
	static public PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);
	 public JDBCCRUDOperations(){
		 conn = DBConnection.getDBConnection();
		 if(conn !=null) {
			 System.out.println("connection established");
		 }
	 }
	/**
	 * this is method which retrives all data from a table
	 * like
	 * select * from customers;
	 */
	public void selectAllCustomers() {
		String selectSql = "select * from customers";
		try {
			pstmt = conn.prepareStatement(selectSql);
			//execute the above statement
			ResultSet rs = pstmt.executeQuery();
			System.out.println("++++++++++++++++++++++++++++++");
			System.out.println("Customers data..........");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("customerid"+"\t"+"customername"+"\t"+"payment_purpose"+"\t"+"amount");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(4)+"\t"+rs.getString("amount"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * this is method which retrives the data from a table
	 * like
	 * select * from customers where customerid = ?;
	 */
	public void selectCustomerById() {
		String selectSql = "select * from customers where customerid = ?";
		try {
			pstmt = conn.prepareStatement(selectSql);
			//enter the customerid
			System.out.println("Enter the customer id to find the details....");
			int cid = sc.nextInt();
			pstmt.setInt(1, cid); //select * from customers where customerid = cid
			
			//execute the above statement
			ResultSet rs = pstmt.executeQuery();
			System.out.println("++++++++++++++++++++++++++++++");
			System.out.println("Customers data..........");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("customerid"+"\t"+"customername"+"\t"+"payment_purpose"+"\t"+"amount");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(4)+"\t"+rs.getString("amount"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * this is method which update the data from a table
	 * like
	 * update customers set customeremail=?,customermobno=? where customerid = ?;
	 */
	public void updateCustomerById() {
		String updateSql = "update customers set payment_purpose = ?,amount = ? where customerid = ?";
		try {
			pstmt = conn.prepareStatement(updateSql);
			//enter the customerid
			System.out.println("Enter the customer id to update....");
			int cid = sc.nextInt();
			pstmt.setInt(3, cid); 
			System.out.println("Enter the payment purpose to update....");
			sc.nextLine();
			String cpayment = sc.nextLine();
			pstmt.setString(1, cpayment);
			System.out.println("Enter the Customer amount");
			float camt = sc.nextFloat();
			pstmt.setFloat(2, camt );
			int updateResult =pstmt.executeUpdate();
			if(updateResult!=0) {
				System.out.println("updated successfully");
			}else {
				System.out.println("not updated");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this is method which delete the data from a table
	 * like
	 * delete from customers where customerid = ?;
	 */
	public void deleteCustomerById() {
		String deleteSql = "delete from customers where customerid = ?";
		try {
			pstmt = conn.prepareStatement(deleteSql);
			//enter the customerid
			System.out.println("Enter the customer id to delete....");
			int cid = sc.nextInt();
			pstmt.setInt(1, cid); //select * from customers where customerid = cid
			int deleteResult = pstmt.executeUpdate();
			if(deleteResult!=0) {
				System.out.println("customer deleted successfully");
			}else {
				System.out.println("customer not found....");
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * this is method inserts the data in to the table
	 * like
	 * insert into customers values(?,?,?,?);
	 */
	public void insertCustomer() {
		String insertSql = "insert into customers values(?,?,?,?,?);";
		try {
			pstmt = conn.prepareStatement(insertSql);
			//we need to setup values for substition variables(?)
			System.out.println("Enter the Customer Details to insert....");
			System.out.println("Enter the Customer Id");
			int cid = sc.nextInt();
			pstmt.setInt(1, cid);
			System.out.println("Enter the Customer name");
			sc.nextLine();
			String cname = sc.nextLine();
			pstmt.setString(2, cname);
			System.out.println("Enter the Customer number");
			int cnum = sc.nextInt();
			pstmt.setInt(3, cnum );
			System.out.println("Enter the purpose_amount");
			sc.nextLine();
			String pamount = sc.nextLine();
			pstmt.setString(4, pamount);
			System.out.println("Enter the Customer amount");
			float camt = sc.nextFloat();
			pstmt.setFloat(5, camt );
			int result = pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("inserted successfully");
			}else {
				System.out.println("not inserted");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

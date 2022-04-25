package com.hexaware.testjdbcoperations;

import com.hexaware.jdbcoperations.JDBCCRUDOperations;
import com.hexaware.jdbcoperations.JDBCUtil;

public class JDBCCrudTest {

	public static void main(String[] args) {

		JDBCUtil jutil = new JDBCUtil();
		jutil.jdbcTransactions();
	}

}

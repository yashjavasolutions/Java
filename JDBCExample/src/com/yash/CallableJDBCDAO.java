package com.yash;

import java.sql.*;



public class CallableJDBCDAO {

	
  public static void main (String args []) throws Exception  
		  {  
	  System.out.println("-------- MySQL JDBC Connection Testing ------------");
	  
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}
	 
		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/","root", "yash");
		
			CallableStatement stmt = connection.prepareCall("{CALL sakila.film_in_stock(?,?,?)}");  
			stmt.setInt(1,1);
			stmt.setInt(2,1);
			stmt.registerOutParameter(3, java.sql.Types.INTEGER);
			stmt.executeUpdate();
			int filmCount = stmt.getInt(3);
	        System.out.println("The number of films in stock is "+ filmCount);
     
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		
	
		  }  

	
}

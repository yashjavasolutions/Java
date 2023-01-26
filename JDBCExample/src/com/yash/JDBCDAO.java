package com.yash;

import java.sql.*;



public class JDBCDAO {

	
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
		
			PreparedStatement stmt = connection.prepareStatement("select * from sakila.actor where actor_id = ?");  
			stmt.setInt(1,2);
			ResultSet rs = stmt.executeQuery();
	
	       
     // Print col 1 => Hi  
       while (rs.next())  
           System.out.println (rs.getString(2));
			
     
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}
		

	 
		
		  }  

	
}

package com.util;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Connectionss{
		public static Connection m() throws ClassNotFoundException, SQLException {

		 Class.forName("com.mysql.jdbc.Driver");
		 Connection	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/taining","root","root123");

	return con ;

		}
				
		}



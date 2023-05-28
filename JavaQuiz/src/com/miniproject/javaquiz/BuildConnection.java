package com.miniproject.javaquiz;

import java.sql.*;
import java.sql.DriverManager;

public class BuildConnection {

 public static Connection getCon()
 {
	 Connection con =null;
	 try {
		 	Class.forName("com.mysql.jdbc.Driver");
		 	String url ="jdbc:mysql://localhost:3306/JavaQuizDatabase";
		 	String user="root";
		 	String password="9856";
		 	con = DriverManager.getConnection(url, user, password);
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	return con;
 }
}

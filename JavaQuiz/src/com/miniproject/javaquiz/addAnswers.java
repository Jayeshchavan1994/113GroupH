package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class addAnswers {

	public void answers()
	{
		String query = "insert into AnswersList values(?,?)";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(query); ) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the Question No : ");
			String QNo = sc.next();
			System.out.println("Please enter the Option No : ");
			String option = sc.next();
			
			pst.setString(1, QNo);
			pst.setString(2, option);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

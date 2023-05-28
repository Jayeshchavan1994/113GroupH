package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListOfQuestions {
	int row = 0;
	String str;
	public void questionslist()
	{
		Scanner sc = new Scanner(System.in);
		String query = "insert into ListOfQuestions values (?,?,?,?,?,?,?)";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(query)) 
		{
				System.out.println("Enter Question No : ");
				String qno= sc.nextLine();
				System.out.println("Enter the Question : ");
				String question =sc.nextLine();
				System.out.println("Enter the Option 1 : ");
				String option1 = sc.nextLine();
				System.out.println("Enter the Option 2 : ");
				String option2 = sc.nextLine();
				System.out.println("Enter the Option 3 : ");
				String option3 = sc.nextLine();
				System.out.println("Enter the Option 4 : ");
				String option4 = sc.nextLine();
				
				System.out.println("Please enter the correct answer : ");
				String answer = sc.nextLine();
			
				pst.setString(1, qno);
				pst.setString(2, question);
				pst.setString(3, option1);
				pst.setString(4, option2);
				pst.setString(5, option3);
				pst.setString(6, option4);
				pst.setString(7, answer);
				row = row + pst.executeUpdate();
				System.out.println(row +" Questions added successfully..!");
				/*System.out.println("Do you want to add more questions : ");
				 str = sc.next();*/
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}
}
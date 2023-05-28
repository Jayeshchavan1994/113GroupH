package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayQuestionsList {
	String QueNo;
	Scanner sc = new Scanner(System.in);
	public void listOfQuestions()
	{
		String query = "select * from ListOfQuestions;";
		String submitanswers = "insert into SubmitAnswers values(?,?)";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(query); PreparedStatement pst1 = con.prepareStatement(submitanswers) ) 
		{
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				QueNo =rs.getString(1);
				System.out.println("QNo >>"+QueNo);
				System.out.println("Question >>"+rs.getString(2));
				System.out.println("Option 1 >>"+rs.getString(3));
				System.out.println("Option 2 >>"+rs.getString(4));
				System.out.println("Option 3 >>"+rs.getString(5));
				System.out.println("Option 4 >>"+rs.getString(6));
				System.out.println("Please enter the answer : ");
				String answer = sc.next();
				
				if(!(answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("4"))){
				
					throw new InvalidInputException("Invalid Input >> Please Submit Answer In Number format");
					
			}
				else {
					pst1.setString(1, QueNo);
					pst1.setString(2, answer);
					pst1.executeUpdate();
				}
				
			}
			QuizResult objQuizResult = new QuizResult();
			objQuizResult.resultData();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		StudentFunction obj = new StudentFunction();
		obj.studentOperation();
	}

}

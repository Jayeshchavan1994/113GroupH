package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QuizResult{
	
	public void resultData()  {
		String query = "select count(*) from (select SubmitAnswers.answer, listofquestions.CorrectAnswer from SubmitAnswers inner join listofquestions on SubmitAnswers.QNo = listofquestions.QNo where SubmitAnswers.answer = listofquestions.CorrectAnswer) as count;";
		String result = "insert into finalmarks(SUserName, SMarks, SGrade) values(?,?,?)";
		
		try (Connection con = BuildConnection.getCon();
				PreparedStatement pst = con.prepareStatement(query);
				PreparedStatement pst1 = con.prepareStatement(result)
				) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int n = rs.getInt(1);

				int marks = n * 10;

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Username");
				String username = sc.next();
				
				String grade;
				if(marks>=80 && marks<=100) {
					grade = "A";
				}
				else if(marks>=60 && marks<80) {
					grade = "B";
				}
				else if(marks>=40 && marks<60) {
					grade = "C";
				}
				else {grade = "Fail";}

				pst1.setString(1, username);
				pst1.setInt(2, marks);
				pst1.setString(3, grade);

			}

			pst1.executeUpdate();

			TruncateData objTruncateData = new TruncateData();
			objTruncateData.truncateTable();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
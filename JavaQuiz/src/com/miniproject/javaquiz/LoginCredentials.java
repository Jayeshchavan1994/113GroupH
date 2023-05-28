package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginCredentials {

	public void FetchLoginData() {
		String query = "select SUserName, SPassword from Student_Registration where SUserName = ? and SPassword = ?;";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(query)) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Name : ");
			String username = sc.next();

			System.out.println("Enter Password : ");
			String password = sc.next();

			pst.setString(1, username);
			pst.setString(2, password);

			ResultSet rs = pst.executeQuery();

			if (!rs.next()) {
				System.out.println("Incorrect login details..! Please try again..!");
			} else {
				if (username != null && password != null) {
					if (username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
						System.out.println("Logged in Successfully...!");

						System.out.println("Please enter your choice :");
						System.out.println("1. Take Quiz");
						System.out.println("2. Exit");

						Scanner sc1 = new Scanner(System.in);
						int ch = sc1.nextInt();
						switch (ch) {
						case 1:
							System.out.println("**Please take the quiz shown below**");
							DisplayQuestionsList objDisplayQuestionsList = new DisplayQuestionsList();
							objDisplayQuestionsList.listOfQuestions();
							break;

						case 2:
							Exit(0);
							
							default :
						}
					}
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void AdminLoginDetails() {

		String query = "select AdminUsername, AdminPassword from Admin_Login where AdminUsername = ? and AdminPassword = ?;";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(query)) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User Name : ");
			String adminName = sc.next();

			System.out.println("Enter Password : ");
			String adminPassword = sc.next();

			pst.setString(1, adminName);
			pst.setString(2, adminPassword);

			ResultSet rs = pst.executeQuery();

			if (!rs.next()) {
				System.out.println("Incorrect login details..! Please try again..!");
			} else {
				if (adminName != null && adminPassword != null) {
					if (adminName.equals(rs.getString(1)) && adminPassword.equals(rs.getString(2))) {
						Scanner sc1 = new Scanner(System.in);
						System.out.println("1.Add question with 4 options into database");
						System.out.println("2.Display all students score as per ascending order");
						System.out.println("3.Fetch student score by using id");
						System.out.println("4.Exit");
						int ch = sc1.nextInt();

						switch (ch) {

						case 1:
							ListOfQuestions objListOfQuestions = new ListOfQuestions();
							objListOfQuestions.questionslist();
							addAnswers objaddAnswers = new addAnswers();
							objaddAnswers.answers();
							break;

						case 2:
							AdminFunctions objAdminFunctions = new AdminFunctions();
							objAdminFunctions.adminOperation1();
							break;
						case 3:
							AdminFunctions objAdminFunctions2 = new AdminFunctions();
							objAdminFunctions2.adminOperation2();
							break;
						case 4:
							Exit(0);
						}

					}
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private void Exit(int i) {
		// TODO Auto-generated method stub

	}

}

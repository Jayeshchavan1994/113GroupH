package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInput {
	public void UserInputData() {
		String query = "insert into Student_Registration(SFirstName,SLastName,SUserName,SPassword,Scity,SEmail_ID,SMobileNo) values (?,?,?,?,?,?,?)";
		String getId = "select SUserName, Sid from Student_Registration where SUserName = ? ";
		try (Connection con = BuildConnection.getCon();
				PreparedStatement pstmt = con.prepareStatement(query);
				PreparedStatement pst = con.prepareStatement(getId)) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the Student First Name : ");
			String firstname = sc.next();
			System.out.println("Please enter the Student Last Name : ");
			String lastname = sc.next();
			System.out.println("Please enter the Student Username : ");
			String username = sc.next();
			System.out.println("Please enter the Student Password : ");
			String password = sc.next();
			System.out.println("Please enter the Student City : ");
			String city = sc.next();
			System.out.println("Please enter the Student Email id : ");
			String emailid = sc.next();
			System.out.println("Please enter the Student Mobile No. : ");
			String mobileno = sc.next();

			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, username);
			pstmt.setString(4, password);
			pstmt.setString(5, city);
			pstmt.setString(6, emailid);
			pstmt.setString(7, mobileno);

			pstmt.executeUpdate();
			System.out.println("Registration done successfully..!");

			System.out.println("your Login Details >> ");
			pst.setString(1, username);
			
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {

				System.out.println("Your Username >> " +rs.getString(1));
				System.out.println("your Id >> " +rs.getInt(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

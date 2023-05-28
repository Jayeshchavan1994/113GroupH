package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminFunctions {

	public void adminOperation1() {
		String order = "select SUserName,SMarks,SGrade from finalmarks order by SMarks desc";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(order)) {

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				System.out.println("UserName>> "+rs.getString(1));
				System.out.println("Marks>> "+rs.getInt(2));
				System.out.println("Grade>> "+rs.getString(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void adminOperation2() {

		String order = "select SUserName,SMarks,SGrade from finalmarks where Sid = ?";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(order)) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter ID to see Result");
			int id = sc.nextInt();
			pst.setInt(1, id);

			ResultSet rs2 = pst.executeQuery();

			while (rs2.next()) {
				
					System.out.println("UserName>> "+rs2.getString(1));
				    System.out.println("Marks>> "+rs2.getInt(2));
				    System.out.println("Grade>> "+rs2.getString(3));
				   
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
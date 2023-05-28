package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentFunction {

	public void studentOperation() {

		String order = "select SUserName,SMarks from finalmarks where Sid = ?";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(order)) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter ID to see Result");
			int id = sc.nextInt();
			pst.setInt(1, id);

			ResultSet rs2 = pst.executeQuery();

			while (rs2.next()) {

				System.out.println(rs2.getString(1));
				System.out.println(rs2.getInt(2));
				// System.out.println(rs2.getInt(3));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	}
}

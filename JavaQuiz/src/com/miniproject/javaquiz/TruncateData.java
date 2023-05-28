package com.miniproject.javaquiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TruncateData {
	public void truncateTable()
	{
		String query = "truncate table submitanswers";
		try (Connection con = BuildConnection.getCon(); PreparedStatement pst = con.prepareStatement(query))
		{
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

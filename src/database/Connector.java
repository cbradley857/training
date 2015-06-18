package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Connector {

	public static Statement getConnection(String u, String p)
	{
		try {
			Class driver = Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection c = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost/world", "root", "My5ql");
			return c.createStatement();
		} catch (SQLException e) {
			System.out.println("Username and/or Password not recognised");
		}
		return null;
	}
}


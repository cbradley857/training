package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import employee_stuff.Employee;

public class Connector {

	public static Statement getConnection()
	{
		try {
			Class driver = Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection c = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost/world", "root", "kainos");
			return c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList<Employee> createDatabase()
	{
		Statement s = getConnection();
//		try {
//			s.execute("drop database staff");
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			s.execute("source Source.sql;");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			s.execute("source Inserts.sql;");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		ArrayList<Employee> result = new ArrayList<Employee>();
		try {
			s.execute("use staff;");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ResultSet results = s.executeQuery("select * from employee");
			while(results.next())
			{
				try{
					int newId = Integer.parseInt(results.getString(1));
					String newName = results.getString(2);
					float newSalary = Float.parseFloat(results.getString(3));
					
					result.add(new Employee(newId, newName, newSalary));
					
				}catch(Exception e)
				{
					//TODO: Make into actual exception type
				}
				
			}
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}


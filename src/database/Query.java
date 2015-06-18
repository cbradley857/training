package database;

import com.mysql.jdbc.Connection;

import employee_stuff.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Query {

//	private Statement s;
//
//	public Querys() {
//		s = Connector.getConnection();
//	}
//
//	public void useDatabase(String s) {
//		try {
//			s.execute("use "+s+";");
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	}
	
	public static ArrayList<Employee> getAllEmployees()
	{
		Statement s = Connector.getConnection();
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
					
				}catch(NumberFormatException e)
				{
					continue;
				}
				
			}
			
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Employee getEmployeeDetails(int id)
	{
		Statement s = Connector.getConnection();
		
		String query = "select * from employee where id" + id;
		try {
			ResultSet results = s.executeQuery(query);
			
			int newId = Integer.parseInt(results.getString(1));
			String newName = results.getString(2);
			float newSalary = Float.parseFloat(results.getString(3));
			
			return new Employee(newId, newName, newSalary);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

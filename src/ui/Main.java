package ui;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.Connector;

public class Main {

	public static void main(String[] args)
	{
//		EmployeeManager em = new EmployeeManager();
//		em.MainMenu();
		ResultSet r = Connector.createDatabase();
		try {
			while (r.next())
			{
				System.out.println("EmpId: " + r.getString(1) + ", Employee Name: " + r.getString(2) + ", Employee Salary: " + r.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

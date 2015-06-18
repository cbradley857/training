package ui;

import java.sql.SQLException;
import java.util.ArrayList;

import database.Connector;
import employee_stuff.Employee;

public class Main {

	public static void main(String[] args)
	{
//		EmployeeManager em = new EmployeeManager();
//		em.MainMenu();
		ArrayList<Employee> r = Connector.createDatabase();
			/*while (r.next())
			{
				System.out.println("EmpId: " + r.getString(1) + ", Employee Name: " + r.getString(2) + ", Employee Salary: " + r.getString(3));
			}*/
			
			for(Employee e : r)
			{
				System.out.println(e.toString());
			}
		
	}
}

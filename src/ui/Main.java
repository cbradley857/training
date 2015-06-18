package ui;

import java.util.ArrayList;

import database.Connector;
import database.Query;
import employee_stuff.Employee;

public class Main {

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		Query q = new Query(); 
		if (ui.showOptions() == "0") {
			ui.printEmployees(q.getAllEmployees());
		} else {
			ui.printEmployee(q.getEmployeeWithID(ui.askForId()));
		}
		// EmployeeManager em = new EmployeeManager();
		// em.MainMenu();
//		ArrayList<Employee> r = Connector.createDatabase();
		/*
		 * while (r.next()) { System.out.println("EmpId: " + r.getString(1) +
		 * ", Employee Name: " + r.getString(2) + ", Employee Salary: " +
		 * r.getString(3)); }
		 */
//
//		for (Employee e : r) {
//			System.out.println(e.toString());
//		}

	}
}

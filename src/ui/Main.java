package ui;

import java.util.ArrayList;

import database.Connector;
import database.Query;
import employee_stuff.Employee;

public class Main {

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		Query q = new Query(); 
		if (ui.showOptions().equals("0")) {
			ui.printEmployees(q.getAllEmployees());
		} else {
			ui.printEmployee(q.getEmployeeWithID(ui.askForId()));
		}
	}
}

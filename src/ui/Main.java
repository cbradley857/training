package ui;

import database.Query;

public class Main {

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		Query q = new Query();
		boolean b = true;
		while (b == true) {
			if (ui.showOptions().equals("0")) {
				ui.printEmployees(q.getAllEmployees());
			} else {
				ui.printEmployee(q.getEmployeeWithID(ui.askForId()));
			}
			if (ui.doAgain()) {
				b = true;
			} else {
				b = false;
			}
		}
	}
}

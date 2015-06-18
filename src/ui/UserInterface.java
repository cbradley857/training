package ui;

import java.util.ArrayList;
import java.util.Scanner;

import employee_stuff.Employee;

public class UserInterface {

	private Scanner in;

	public UserInterface() {
		in = new Scanner(System.in);
	}

	public String showOptions() {
		System.out.println("Pick Option:");
		System.out
				.println("[0] List Employees, [1] List Employee with given ID");
		String s = in.next();
		if (s == "0" || s == "1") {
			return s;
		} else {
			System.out.println("Input not recognised");
			return showOptions();
		}
	}

	public String askForId() {
		System.out.println("Enter Employee ID:");
		return in.next();
	}

	public void printEmployee(Employee e) {
		System.out.println("EmpId: " + e.getNumber() + ", Employee Name: "
				+ e.getName() + ", Employee Salary: " + e.getSalary());
	}

	public void printEmployees(ArrayList<Employee> e) {
		for (Employee emp : e) {
			printEmployee(emp);
		}
	}
}

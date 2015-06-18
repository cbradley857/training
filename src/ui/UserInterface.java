package ui;

import java.util.ArrayList;
import java.util.Scanner;

import employee_stuff.Employee;

public class UserInterface {

	private Scanner in;
	private String userName;
	private String password;

	public UserInterface() {
		in = new Scanner(System.in);
	}
	
//	public void logIn()
//	{		
//		System.out.println("Ple");	
//	}

	public String showOptions() {
		System.out.println("Pick Option:");
		System.out.println("[0] List Employees, [1] List Employee with given ID");
		String s = in.next();
		if (s.equals("0") || s.equals("1")) {
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

package ui;

import java.util.Scanner;

import employee_stuff.Employee;

public class UserInterface {

	private Scanner in;
	
	public UserInterface() {
		in = new Scanner(System.in);
	}
	
	public String showOptions()
	{
		System.out.println("Pick Option:");
		System.out.println("[0] List Employees, [1] List Employee with given ID");
		return in.next();
	}
	
	public void printEmployee(Employee e)
	{
		System.out.println("EmpId: " + e.getNumber() +
				 * ", Employee Name: " + e.getName() + ", Employee Salary: " +
				 * e.getSalary());
	}
}

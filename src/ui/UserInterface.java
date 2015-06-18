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
//		this.getUsername();
//		this.getPassword();
	}

	public String showOptions() {
		System.out.println("Pick Option:");
		System.out
				.println("[0] List Employees, [1] List Employee with given ID");
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
		if (e != null) {
			System.out.println("EmpId: " + e.getNumber() + ", Employee Name: "
					+ e.getName() + ", Employee Salary: " + e.getSalary());
		}
	}

	public void printEmployees(ArrayList<Employee> e) {
		for (Employee emp : e) {
			printEmployee(emp);
		}
	}

	public boolean doAgain() {
		System.out.println("Would you like to run another query?");
		System.out.println("[y] = Yes, [n] = No");
		String s = in.next();
		if (s.equals("y") || s.equals("Y")) {
			return true;
		} else if (s.equals("n") || s.equals("N")) {
			return false;
		} else {
			System.out.println("Input not recognised");
			return doAgain();
		}
	}
	public void getUsername()
	{
		System.out.println("Please enter username:");
		setUserName(in.next());
	}
	public void getPassword()
	{
		System.out.println("Please enter password:");
		password = in.next();
	}

	public String getUserName() {
		return userName;
	}
	public String getPasswd()
	{
		return password;
	}

	private void setUserName(String userName) {
		this.userName = userName;
	}
}

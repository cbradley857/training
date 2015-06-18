package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import employee_stuff.Employee;

public class Query {

	private Statement s;

	public Query() {
		s = Connector.getConnection();
		useDatabase("staff");
	}

	public void useDatabase(String string) {
		try {
			s.execute("use "+string+";");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	public ArrayList<Employee> getAllEmployees() {
		ResultSet r;
		ArrayList<Employee> array  = new ArrayList<Employee>();;
		try {
			r = s.executeQuery("select * from employee");
			while (r.next())
			{
				array.add(new Employee(r.getInt(1), r.getString(2), r.getFloat(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}

	public Employee getEmployeeWithID(String askForId) {
		ResultSet r;
		Employee emp= new Employee();
		try {
			r = s.executeQuery("select * from employee where id = " + askForId);
			emp = new Employee(r.getInt(1), r.getString(2), r.getFloat(3));
		} catch (SQLException e) {
			System.out.println("*No employee with that ID*");
		}
		return emp;
	}
}

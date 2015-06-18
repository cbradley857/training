package employee_stuff;

public class Employee implements IPayable{
	private int number;
	protected float salary;
	private String name;
	private final float minSalary = 7000;
	private float bonus;

	public Employee() {
		bonus = 50f;
	}

	public Employee(int newNumber) {
		this();
		number = newNumber;
	}

	public Employee(int newNumber, String newName) {
		this(newNumber);
		name = newName;
	}

	public Employee(int newNumber, String newName, float newSalary) {
		this(newNumber, newName);
		salary = newSalary;
	}
	
	public Employee(int newNumber, float newSalary, String newName) {
		this(newNumber, newName);
		salary = newSalary;
	}

	public int getNumber() {
		return number;
	}

	public boolean setNumber(int i) {
		number = i;
		return true;
	}
	
	public boolean setNumber(String s)
	{
		try{
		int i = Integer.parseInt(s);
		return setNumber(i);
		}catch(NumberFormatException e){
			number = -1;
			return false;
		}
	}

	public float getSalary() {
		return salary;
	}

	public boolean setSalary(float f) {
		if (f >= minSalary) {
			salary = f;
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public float calcPay() {
		return salary / 12;
	}
	/** toString method shows stuff
	 * @return returns a string of information concerning the employee
	 */
	public String toString()
	{
		return String.format("Employee %d: %s, £%.2f, Monthly gross pay: £%.2f", 
				this.getNumber(), this.getName(), this.getSalary(), this.calcPay());
	}
}

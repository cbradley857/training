package employee_stuff;

public class SalesEmployee extends Employee {

	private float salesTotal;
	private float commissionRate;

	public SalesEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int newNumber) {
		super(newNumber);
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int newNumber, String newName) {
		super(newNumber, newName);
		// TODO Auto-generated constructor stub
	}

	public SalesEmployee(int newNumber, String newName, float newSalary) {
		super(newNumber, newName, newSalary);
		// TODO Auto-generated constructor stub
	}
	
	public SalesEmployee(int newNumber, String newName, float newSalary, float newCommissionRate) {
		super(newNumber, newName, newSalary);
		commissionRate = newCommissionRate;
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters

	public float getSalesTotal() {
		return salesTotal;
	}

	public void setSalesTotal(float f) {
		salesTotal = f;
	}

	public float getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(float f) {
		commissionRate = f;
	}
	
	public float calcPay()
	{
		return super.calcPay() + (commissionRate * salesTotal);
	}
}

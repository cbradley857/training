package employee_stuff;

public class Consultant implements IPayable {
	
	private int daysWorked;
	private float dailyRate;
	private String name;
	
	public Consultant(float f, String n)
	{
		setDailyRate(f);
		name = n;
	}
	
	@Override
	public float calcPay() {
		return getDaysWorked() * getDailyRate(); 
	}

	private int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

	private float getDailyRate() {
		return dailyRate;
	}

	private void setDailyRate(float dailyRate) {
		this.dailyRate = dailyRate;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String s) {
		name = s;
	}


}

package employee_stuff;

public class GuardDog implements IPayable{

	private String name;
	private static float foodPrice = 20f;
	private static float kennelCost = 100f; 
	
	public GuardDog(String n)
	{
		name = n;
	}
	@Override
	public float calcPay() {
		return kennelCost + foodPrice;
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

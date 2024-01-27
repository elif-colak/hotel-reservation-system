
public class Bills implements Calculable {

	private String type;
	private double amount;
	private String month;
	
	public Bills(String type, double amount, String month ) {
		setType(type);
		setAmount(amount);
		setMonth(month);

	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public String getMonth() {
		return month;		
	}

	//interface method getCost()
	@Override
	public double getCost() {
		return amount;
	}

}

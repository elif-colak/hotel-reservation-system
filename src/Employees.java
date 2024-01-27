
public class Employees implements Calculable {

	private String name;
	private String surname;
	private double monthlyPayment;
	private int id;
	
	public Employees(String name, String surname, double monthlyPayment, int id ) {
		setName(name);
		setSurname(surname);
		setMonthlyPay(monthlyPayment);
		setId(id);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setMonthlyPay(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	public double getMonthlyPay() {
		return monthlyPayment;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}		
	
	//interface method getCost()
	@Override
	public double getCost() {
		return monthlyPayment;
	}

}

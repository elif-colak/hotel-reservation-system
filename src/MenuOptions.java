
public enum MenuOptions {
	ONE("1. Create new Reservation with Room Type",1),
	TWO("2. Display all Reservations",2),
	THREE("3. List the reservations for a specific city",3),
	FOUR("4. Add extra services to a reservation",4),
	FIVE("5. Calculate total cost for each service",5),
	SIX("6. Display the total cost of every customer",6),
	SEVEN("7. Add an Employee" ,7),
	EIGHT("8. Add a Bill",8),
	NINE("9. Get Monthly Balance",9),
	TEN("10. List all Services sorted based on cost",10),
	ELEVEN("11. List all Reservations sorted based on hotel names",11),
	TWELVE("12. Exit",12);

	private String title;
	private int number;
	
	MenuOptions(String Menutitle, int number) {
		setMenuTitle(Menutitle);
		setNumber(number);		
	}
	
	public void setMenuTitle(String title) {
		this.title = title;
	}
	
	public String getMenuTitle() {
		return title;
	}	
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}	
	
}

public class Reservation extends Services implements Comparable<Reservation>{
		private String hotelName;
		private String reservationMonth;
		private int reservationStart;
		private int reservationEnd;
		private int dailyCost;
		private Room room;
		private String city;
		public static int totalNumOfReservations = 0 ; //holds the total number of reservations
		
		
		public Reservation(String name, String month, int start, int end, String city /*, int cost , Room r */) {
			setHotelName(name);
			setReservationMonth(month);
			setReservationStart(start);
			setReservationEnd(end);
			setCityName(city);
			//setDailyCost(cost);
			//setRoom(r);
		
		}
		
		// setter methods
		public void setCityName(String city) {
			this.city = city;
		}
		
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		
		public void setReservationMonth(String reservationMonth) {
			this.reservationMonth = reservationMonth;
		}
		
	    public void setReservationStart(int reservationStart) {
	    	this.reservationStart = reservationStart;
	    }
	    
	    public void setReservationEnd(int reservationEnd) {
	    	this.reservationEnd= reservationEnd;
	    }
	    
	    public void setDailyCost(int dailyCost) {
	    	this.dailyCost= dailyCost;
	    }
	    
	    public void setRoom(Room room) {
	    	this.room= room;
	    }
	    
	    
		// getter methods
	    public String get_city() {
			return city;
		}
	    
		public String get_name() {
			return hotelName;
		}
		
		public String get_month() {
			return reservationMonth;
		}
		
		public int get_cost() {
			return dailyCost;
		}
		public int get_start() {
			return reservationStart;
		}
		public int get_end() {
			return reservationEnd;
		}
		
		
		public void displayInfo() {
			System.out.println("\n");
			/*if(get_month().equals("July")| get_month().equals("july")  | get_month().equals("June") | get_month().equals("june") | get_month().equals("August")|get_month().equals("august") ) {
				System.out.printf("Reservation for a %s room in %s starts on %s %d and ends on %s %d. Reservation has a total cost of $%d.",room.getRoomType(),get_name(),get_month(),get_start(),get_month(),get_end(),calculateTotalPrice(2));
			}
			else {
				System.out.printf("Reservation for %s room in %s starts on %s %d and ends on %s %d. Reservation has a total cost of $%d.",room.getRoomType(),get_name(),get_month(),get_start(),get_month(),get_end(),calculateTotalPrice());
			}*/
			System.out.printf("Reservation at %s starts on %s %d and ends on %s %d.",get_name(),get_month(),get_start(),get_month(),get_end());
			
		}
		
		@Override
		public double calculateService() {
			return calculateTotalPrice();
		}

		@Override
		public String getServiceType() {
			return "Reservation";
		}

		
		public int  calculateTotalPrice() {
			return get_cost()*(get_end()-get_start());
		}
		
		public int calculateTotalPrice(int multiplier) {
			return multiplier*(get_cost()*(get_end()-get_start()));
		}

		//interface method getCost()
		@Override
		public double getCost() {
			return calculateService();
		}
		
		@Override
		public void displayServiceInfo() {
			System.out.printf("Customer ID: %d, Service Type: Room Booking, Cost: %.2f\n", getCustomerID(), getCost());		
			 
		}

		@Override
		public int compareTo(Reservation r) {
				return this.hotelName.compareTo(r.hotelName);
			
		}
		

}
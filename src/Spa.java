
public class Spa extends Services {
		private int days;
		private double spaCost;
		
		public Spa(int days) {
			setDays(days);
			setSpaCost(100);
		}
		
		public void setSpaCost(double spaCost) {
			this.spaCost = spaCost;
		}
		
		public double getSpaCost() {
			return spaCost;
		}
		
		public void setDays(int days) {
			this.days = days;
		}
		
		public int getDays() {
			return days;
		}

		@Override
		public double calculateService() {
			return days*spaCost;
		}

		@Override
		public String getServiceType() {
			return "Spa";
		}

		//interface method getCost()
		@Override
		public double getCost() {
			return calculateService();
		}

		@Override
		public void displayServiceInfo() {
			System.out.printf("Customer ID: %d, Service Type: Spa, Cost: %.2f\n", getCustomerID(), getCost());
			
		}
		
		
}

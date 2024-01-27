
public abstract class Services implements Calculable{
		
		private int CustomerID;
		
		public Services(){
			
		}
		
		public void setCustomerID(int CustomerID) {
			this.CustomerID = CustomerID;
		}
		
		public int getCustomerID() {
			return CustomerID;
		}
		
		public abstract double calculateService();
		public abstract String getServiceType();		
		public abstract void displayServiceInfo();

}

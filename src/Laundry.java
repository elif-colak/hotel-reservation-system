
public class Laundry extends Services{

	private int clothingPieces;
	private double laundryCost;
	
	
	public Laundry(int clothingPieces) {
		setClothingPieces(clothingPieces);
		setLaundryCost(20);
	}
	
	public void setClothingPieces(int clothingPieces) {
		this.clothingPieces = clothingPieces;
	}
	
	public int getClothingPieces() {
		return clothingPieces;
	}
	
	public void setLaundryCost(double laundryCost) { 
		this.laundryCost = laundryCost;
	}
	
	public double getLaundryCost() {
		return laundryCost;
	}

	@Override
	public double calculateService() {
		return clothingPieces*laundryCost;
	}

	@Override
	public String getServiceType() {
		return "Laundry";
	}

	//interface method getCost()
	@Override
	public double getCost() {
		return calculateService();
	}

	@Override
	public void displayServiceInfo() {
		System.out.printf("Customer ID: %d, Service Type: Laundry, Cost: %.2f\n", getCustomerID(), getCost());		
	}
	
}

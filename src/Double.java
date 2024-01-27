
public class Double extends Room{
	
	public Double(){
		setRoomType("Double");
		setDailyCost(180);
		setRoomSize(30);
		setHasBath(false);
	}	
	
	public Double(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		super(roomType, dailyCost, roomSize, hasBath);
		setRoomType("Double");
		setDailyCost(180);
		setRoomSize(30);
		setHasBath(false);
	}	
	
}

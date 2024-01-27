
public class Family extends Room {
	
	public Family() {
		setRoomType("Family");
		setDailyCost(400);
		setRoomSize(50);
		setHasBath(false);
	}
	

	public Family(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		super(roomType, dailyCost, roomSize, hasBath);
		setRoomType("Family");
		setDailyCost(400);
		setRoomSize(50);
		setHasBath(false);
	}
	
}

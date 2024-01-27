
public class Club extends Room {
	
	public Club() {
		setRoomType("Club");
		setDailyCost(250);
		setRoomSize(45);
		setHasBath(true);
	}
		
	public Club(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		super(roomType, dailyCost, roomSize, hasBath);
		setRoomType("Club");
		setDailyCost(250);
		setRoomSize(45);
		setHasBath(true);
	}
	
}

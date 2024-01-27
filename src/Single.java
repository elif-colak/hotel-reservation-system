
public class Single extends Room {

	public Single() {
		setRoomType("Single");
		setDailyCost(100);
		setRoomSize(15);
		setHasBath(false);
	}
	
	
	public Single(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		super(roomType, dailyCost, roomSize, hasBath);
		setRoomType("Single");
		setDailyCost(100);
		setRoomSize(15);
		setHasBath(false);
	}
	
}

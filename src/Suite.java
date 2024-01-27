
public class Suite extends Room{
	
	public Suite() {
		setRoomType("Suite");
		setDailyCost(650);
		setRoomSize(80);
		setHasBath(true);
	}

	public Suite(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		super(roomType, dailyCost, roomSize, hasBath);
		setRoomType("Suite");
		setDailyCost(650);
		setRoomSize(80);
		setHasBath(true);
	}
	
}

public class FamilywithView extends Room {
	
	public FamilywithView() {
		setRoomType("Family with View");
		setDailyCost(450);
		setRoomSize(50);
		setHasBath(true);
	}

	public FamilywithView(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		super(roomType, dailyCost, roomSize, hasBath);
		setRoomType("Family with View");
		setDailyCost(450);
		setRoomSize(50);
		setHasBath(true);
	}
	
}

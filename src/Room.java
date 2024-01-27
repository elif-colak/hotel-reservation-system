
public class Room {
	private String roomType;
	private int  dailyCost;
	private int roomSize;
	private Boolean hasBath;
	
	
	public Room() {
		
	}
	
	
	public Room(String roomType, int dailyCost, int roomSize, Boolean hasBath) {
		setRoomType(roomType);
		setRoomSize(roomSize);
		setDailyCost(dailyCost);
	    setHasBath(hasBath);

	}
	
	// setter methods
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}
	
    public void setDailyCost(int dailyCost) {
    	this.dailyCost = dailyCost;
    }
    
    public void setHasBath(Boolean hasBath) {
    	this.hasBath = hasBath;
    }
    
    
    // getter methods
    public String getRoomType() {
      	 return roomType;
      }
    
    public int getRoomSize() {
   	 return roomSize;
   }
    
    public int getDailyCost() {
    	 return dailyCost;
    }
    
    public Boolean getHasBath() {
   	 return hasBath;
   }
   
    
    
    }
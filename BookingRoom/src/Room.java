
public class Room {
		
	private int capacity;
	private RoomState rs;
	private int roomNo;
	
	Room(int size, RoomState rs, int rn)
	{
		capacity = size;
		this.rs = rs;
		roomNo = rn;
		
	}

	public int getRoomNo()
	{
		return roomNo;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public RoomState getRoomState()
	{
		return rs;
	}
	public void setRoomState(RoomState sr)
	{
		rs = sr;
	}
	
	
}

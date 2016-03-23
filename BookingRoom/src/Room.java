
public class Room {
	
	Room(int size, RoomState rs)
	{
		capacity = size;
		this.rs = rs;
	}
	
	private int capacity;
	private RoomState rs;
	
	public RoomState getRoomState()
	{
		return rs;
	}
	public void setRoomState(RoomState sr)
	{
		rs = sr;
	}
	
	
}

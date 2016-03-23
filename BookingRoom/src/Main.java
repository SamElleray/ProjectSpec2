import java.util.*;

public class Main {

	Scanner userInput = new Scanner(System.in);
	String trainer[] = new String[3];
	Boolean booking = true;
	ArrayList<Room> rooms = new ArrayList();

	Main() {
		rooms.add(new Room(3, RoomState.empty));
		rooms.add(new Room(55, RoomState.empty));
		rooms.add(new Room(20, RoomState.empty));
		rooms.add(new Room(20, RoomState.full));

		System.out.println("Welcome to the booking system");
		System.out.println("The Current Rooms available are: ");

		for (int i = 0; i < rooms.size(); i++) {
			System.out.println(i + ": ");
			System.out.println(rooms.get(i).getRoomState());// <- this returns
															// the Room object
															// at the first
															// index on the
															// array list
		}
		System.out
				.println("Would you like to book a room that is currently available?");
		do
		{//INSERT WHILE LOOP HERE TO MAKE IT RUN MORE THAN ONCE
			int x = userInput.nextInt();
			if (rooms.get(x).getRoomState() == RoomState.full) {
				System.out
						.println("please choose another room, that room is currently in use");
				
			} else
				System.out.println("Thankyou your room has been booked");
			rooms.get(x).setRoomState(RoomState.full);
			booking = false;
		}while (!booking);

	}

//	 Methods
//	 private int getRoomNo() {
//	 System.out.println("Please input a room number that you would like: 1, 2 or 3");
//	 int x = userInput.nextInt();
//	 return x;
//	 }
//	
//	 private String getTrainer() {
//	 System.out.println("Please input a trainer that is teaching the class");
//	 String z = userInput.next();
//	 return z;
//	 }

	public static void main(String[] args) {
		Main theMain = new Main();
	}
}

import java.util.*;

public class Main {

	Scanner userInput = new Scanner(System.in);
	Boolean booking = true;
	Boolean choosingTrainer = true;
	Boolean choosingClass = true;
	ArrayList<Room> rooms = new ArrayList();
	ArrayList<Trainer> trainer = new ArrayList();
	ArrayList<Student> student = new ArrayList();
	int chosenRoom;

	Main() {
		createDummy();
		// ----------------------------------Picking a Room
		// ---------------------------------

		System.out.println("Welcome to the booking system");
		System.out.println("The Current Rooms available are: ");

		for (int i = 0; i < rooms.size(); i++) {
			System.out.println(i + ": ");
			System.out.println(rooms.get(i).getRoomState());
		}
		System.out
				.println("Would you like to book a room that is currently available?");
		do {
			chosenRoom = userInput.nextInt();
			if (rooms.get(chosenRoom).getRoomState() == RoomState.full) {
				System.out
						.println("please choose another room, that room is currently in use");
				booking = true;
			} else {
				booking = false;
				System.out.println("Thankyou your room has been booked");
				rooms.get(chosenRoom).setRoomState(RoomState.full);
			}
		} while (booking);
		System.out.println("Hello");
		// -------------------------------------Picking a
		// Trainer------------------------------------

		System.out.println("Which trainer would you like?");
		for (int i = 0; i < trainer.size(); i++) {
			System.out.println(i + 1 + ": " + trainer.get(i).getTN());
			System.out.println(trainer.get(i).getCT());
			if (trainer.get(i).getAvailablilty() == true) {
				System.out.println("Available \n");
			} else
				System.out.println("Unavailable \n");
		}

		do {
			int trainerChoice = userInput.nextInt();
			if (trainer.get(trainerChoice - 1).getAvailablilty() == false) {
				System.out
						.println("The trainer you have picked is currently unavailable please choose another");
				booking = true;
			} else {
				System.out.println("You have picked trainer "
						+ trainer.get(trainerChoice - 1).getTN() + " "
						+ "in room " + rooms.get(chosenRoom).getRoomNo());
				choosingTrainer = false;
			}

		} while (choosingTrainer);

		// -------------------------------------Picking which class you want

		for (int i = 0; i < student.size(); i++) {
			System.out.println("Class: " + student.get(i).getClassNo()
					+ " has " + student.get(i).getSN() + " people in it");
		}
		do {
			int classChoice = userInput.nextInt();

			if (student.get(classChoice).getSN() > rooms.get(chosenRoom)
					.getCapacity()) {
				System.out
						.println("That room is too small for your class, please pick another one");
				choosingClass = true;
			} else {
				System.out.println("Thankyou for your booking.");
				choosingClass = false;
			}
		} while (choosingClass);
	}

	// -------------------------

	void createDummy() {
		rooms.add(new Room(500, RoomState.empty, 1));
		rooms.add(new Room(25, RoomState.empty, 2));
		rooms.add(new Room(30, RoomState.empty, 3));
		rooms.add(new Room(20, RoomState.full, 4));
		trainer.add(new Trainer(true, "Enterprise Architecture", "Jake"));
		trainer.add(new Trainer(true, "DevOps", "Aaron"));
		trainer.add(new Trainer(false, "Java", "James"));
		student.add(new Student(1, 30));
		student.add(new Student(2, 20));
		student.add(new Student(3, 10));
	}

	public static void main(String[] args) {
		Main theMain = new Main();
	}
}

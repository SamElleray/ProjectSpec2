import java.util.*;

public class BookingRoomStage1
{
	Scanner userInput = new Scanner(System.in);

	String trainerName;
	int trainerChoice;
	int classChoice;

	BookingRoomStage1() {
		// createDummy();
		// ----------------------------------Picking a Room
		// ---------------------------------

		System.out.println("Welcome to the booking system");
		System.out.println("The Current Rooms available are: ");

		for (int i = 0; i < LocalDataStore.getLocalDataStore().getNumberOfRooms(); i++)
		{
			System.out.println(i + 1 + ": ");
			System.out.println(LocalDataStore.getLocalDataStore().getRoomByIndex(i).getRoomState());
		}

		Boolean booking = true;

		int chosenRoom = choosingRoom(booking);
		addingTrainer();
		choosingTeacher();
		choosingClass(chosenRoom);
	}

	// ------------------------- methods
	// ----------------------------------------------------------------

	private void addingTrainer()
	{
		System.out.println("Would you like to add a trainer? Yes/No");
		String trainerAdd = userInput.next();
		if (trainerAdd.equalsIgnoreCase("y") || trainerAdd.equalsIgnoreCase("yes"))
		{
			System.out.println("please input a trainer Name");
			String addName = userInput.next();
			System.out.println("please input a course that the trainer teaches");
			String addCourse = userInput.next();
			LocalDataStore.getLocalDataStore().addTrainer(addName, addCourse);

		}
	}

	private void choosingClass(int chosenRoom)
	{
		Boolean choosingClass = true;
		do
		{
			System.out.println("please type the number of students in your class");
			classChoice = userInput.nextInt();
			if (classChoice > LocalDataStore.getLocalDataStore().getRoomByNumber(chosenRoom).getCapacity())
			{
				System.out.println("Your class will not fit in the chosen room");
				choosingClass = true;
			}
			else
			{
				System.out.println("thankyou for your booking");
				System.out.println("You have booked room " + LocalDataStore.getLocalDataStore().getRoomByNumber(chosenRoom).getRoomNo() + " With trainer " + LocalDataStore.getLocalDataStore().getNameOfTeachers(trainerName).getTrainerName() + " for your class of " + classChoice + " people.");
				choosingClass = false;
			}
		} while (choosingClass);

	}

	public void choosingTeacher()
	{
		Boolean choosingTrainer = true;
		do
		{
			System.out.println("Which trainer would you like?");
			trainerName = userInput.next();

			System.out.println(LocalDataStore.getLocalDataStore().getNameOfTeachers(trainerName).getTrainerName());
			System.out.println(LocalDataStore.getLocalDataStore().getNameOfTeachers(trainerName).getCourseTaught());
			if (LocalDataStore.getLocalDataStore().getNameOfTeachers(trainerName).getAvailablilty() == true)
			{
				System.out.println("Available \n");
			}
			else
				System.out.println("Unavailable \n");

			System.out.println("Would you like to book this trainer? Yes/No");
			String yesNoChoice = userInput.next();

			if (yesNoChoice.equals("Yes"))
				if (LocalDataStore.getLocalDataStore().getNameOfTeachers(trainerName).getAvailablilty() == false)
				{
					System.out.println("The trainer you have picked is currently unavailable please choose another");
					choosingTrainer = true;
				}
				else
				{
					System.out.println("You have picked trainer " + LocalDataStore.getLocalDataStore().getNameOfTeachers(trainerName).getTrainerName());
					choosingTrainer = false;
				}

		} while (choosingTrainer);

	}

	public int choosingRoom(boolean booking)
	{
		int chosenRoom;
		do
		{
			System.out.println("Would you like to book a room that is currently available?");

			chosenRoom = userInput.nextInt();
			if (LocalDataStore.getLocalDataStore().getRoomByNumber(chosenRoom).getRoomState() == RoomState.full)
			{
				System.out.println("please choose another room, that room is currently in use");
				booking = true;
			}
			else
			{
				booking = false;
				System.out.println("Thankyou");
				LocalDataStore.getLocalDataStore().getRoomByNumber(chosenRoom).setRoomState(RoomState.full);
			}
		} while (booking);
		return chosenRoom;

	}

	public static void main(String[] args)
	{
		BookingRoomStage1 theMain = new BookingRoomStage1();
	}
}

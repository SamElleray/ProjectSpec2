import java.util.ArrayList;

public class LocalDataStore {
	private static LocalDataStore localDataStore = new LocalDataStore();
	
	private ArrayList<Room> rooms = new ArrayList<Room>();
	private ArrayList<Trainer> trainers = new ArrayList<Trainer>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	private LocalDataStore(){
		rooms.add(new Room(50, RoomState.empty, 1));
		rooms.add(new Room(25, RoomState.empty, 2));
		rooms.add(new Room(30, RoomState.empty, 3));
		rooms.add(new Room(20, RoomState.full, 4));
		trainers.add(new Trainer(true, "Enterprise Architecture", "Jake"));
		trainers.add(new Trainer(true, "DevOps", "Aaron"));
		trainers.add(new Trainer(false, "Java", "James"));
		students.add(new Student(1, 30));
		students.add(new Student(2, 20));
		students.add(new Student(3, 10));
	}
	
	/**
	 * Returns the singleton instance of LocalDataStore
	 * 
	 * @return LocalDataStore - the singleton instance of localDataStore.
	 */
	public static LocalDataStore getLocalDataStore() {
		return localDataStore;
	}
	
	/**
	 * This method returns a specific room
	 * 
	 * @param index - the room to be returned
	 * @returnRoom - the selected room
	 */
	public Room getRoomByIndex(int index){
		return rooms.get(index);
	}
	
	/**
	 * This method returns a specific room based on the room number
	 * 
	 * @param index - the room to be returned
	 * @return Room - the selected room
	 */
	public Room getRoomByNumber(int roomNo){
		for(int i = 0; i < getNumberOfRooms(); i++)
			if(rooms.get(i).getRoomNo() == roomNo)
				return rooms.get(i);
		return null;
	}
	/**
	 * returns the number of rooms that are currently stored
	 * @return
	 */
	public int getNumberOfRooms() {
		return rooms.size();
	}
	
	/**
	 * Creates a new Trainer object and passes in parameters.
	 * @param trainerName
	 * @param trainerCourse
	 */
	public void addTrainer(String trainerName, String trainerCourse)
	{
		Trainer trainer = new Trainer(trainerName, trainerCourse);
		addTrainer(trainer);
	}
	
	/**
	 * adds the new Trainer object into the array
	 * @param trainer
	 */
	public void addTrainer(Trainer trainer)
	{
		trainers.add(trainer);
	}
	
	public int getNumberOfTrainers()
	{
		return trainers.size();
	}
	
	public Trainer getNameOfTeachers(String trainerName)
	{
		for (int i = 0; i < trainers.size(); i++)
			if(trainers.get(i).getTrainerName().equals(trainerName))
				return trainers.get(i);
		return null;
	}
	
}

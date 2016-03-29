
public class Trainer {
	
	private boolean available;
	private String courseTaught;
	private String trainerName;
	
	Trainer(boolean available, String course, String tname)
	{
		trainerName = tname;
		courseTaught = course;
		this.available = available;
	}
	
	Trainer(String trainerName, String trainerCourse)
	{
		this.trainerName = trainerName;
		this.courseTaught = trainerCourse;
		available = true;
	}
	
	public String getCourseTaught()
	{
		return courseTaught;
	}
	
	public boolean getAvailablilty()
	{
		return available;
	}
	
	public String getTrainerName() {
		return trainerName;
	}
	
	public void setAvailability(boolean yesno)
	{
		available = yesno;
	}
}

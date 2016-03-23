
public class Trainer {
	
	private boolean available;
	String courseTaught;
	String trainerName;
	
	Trainer(boolean yesno, String course, String tname)
	{
		trainerName = tname;
		courseTaught = course;
		available = yesno;
	}

	public String getTN()
	{
		return trainerName;
	}
	
	public String getCT()
	{
		return courseTaught;
	}
	
	public boolean getAvailablilty()
	{

		return available;
		
	}
	
	public void setAvailability(boolean yesno)
	{
		available = yesno;
	}
}

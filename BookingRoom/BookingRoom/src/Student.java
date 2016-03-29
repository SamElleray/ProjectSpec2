
public class Student 
{
	public int classNo;
	public int noOfStudents;
	Student (int ClassNo, int NoOfStudents)
	{
		classNo = ClassNo;
		noOfStudents = NoOfStudents;
	}
	
	public int getSN()
	{
		return noOfStudents;
	}
	
	
	public int getClassNo()
	{
		return classNo;
	}
	
}

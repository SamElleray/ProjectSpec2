
public class Course
{
	public String courseName;
	public String courseTeacher;
	public int courseSize; 
	Course(String coursename, String courseteacher, int coursesize)
	{
		courseName = coursename;
		courseTeacher = courseteacher;
		courseSize = coursesize;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public String getCourseTeacher()
	{
		return courseTeacher;
	}
	
	public int getCourseSize()
	{
		return courseSize;
	}
}

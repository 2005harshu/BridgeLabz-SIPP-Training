package MultillevelInheritance.CourseHierarchy;

public class Course {
	 String courseName;
	    int duration; // in hours

	    public Course(String courseName, int duration) {
	        this.courseName = courseName;
	        this.duration = duration;
	    }

	    public void displayInfo() {
	        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
	    }

}

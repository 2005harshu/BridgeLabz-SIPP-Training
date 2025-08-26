package MultillevelInheritance.CourseHierarchy;

public class Main {
	 public static void main(String[] args) {
	        Course basic = new Course("C Programming", 30);
	        OnlineCourse online = new OnlineCourse("Java Full Stack", 60, "Udemy", true);
	        PaidOnlineCourse paid = new PaidOnlineCourse("Python AI", 90, "Coursera", true, 3999.0, 15.0);

	        basic.displayInfo();
	        System.out.println("------");
	        online.displayInfo();
	        System.out.println("------");
	        paid.displayInfo();
	    }

}

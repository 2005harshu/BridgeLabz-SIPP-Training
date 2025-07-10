package universityEnrollmmentSystem;

public class Main {
	
	    public static void main(String[] args) {
	        Faculty prof = new Faculty("Dr. Smith");
	        Course math = new Course("MATH101", "Calculus");
	        Course cs = new Course("CS102", "Data Structures");

	        Student u1 = new Undergraduate("Alice", 101);
	        Student p1 = new Postgraduate("Bob", 201);

	        u1.enrollInCourse(math);
	        u1.enrollInCourse(cs);
	        p1.enrollInCourse(cs);

	        prof.assignGrade(u1, math, 8.0);
	        prof.assignGrade(u1, cs, 9.0);
	        prof.assignGrade(p1, cs, 7.5);

	        printTranscript(u1);
	        printTranscript(p1);
	    }

	    public static void printTranscript(Student student) {
	        System.out.println("\nTranscript for " + student.name + " (" + student.getLevel() + "):");
	        for (Enrollment e : student.getTranscript()) {
	            String gradeStr = e.getGrade() != null ? String.valueOf(e.getGrade()) : "Not graded";
	            System.out.println(" - " + e.getCourse().title + ": " + gradeStr);
	        }
	        System.out.println("GPA: " + student.getGPA());
	    }
	
}

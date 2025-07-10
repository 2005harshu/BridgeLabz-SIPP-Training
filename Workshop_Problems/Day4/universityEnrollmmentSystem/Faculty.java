package universityEnrollmmentSystem;

public class Faculty implements Graded {
    String name;

    public Faculty(String name) {
        this.name = name;
    }

    @Override
    public void assignGrade(Student student, Course course, double marks) {
        for (Enrollment e : student.getTranscript()) {
            if (e.getCourse().equals(course)) {
                e.setGrade(marks);
                System.out.println("Grade " + marks + " assigned to " + student.name + " for " + course.title);
                return;
            }
        }
        System.out.println("Student not enrolled in course.");
    }
}

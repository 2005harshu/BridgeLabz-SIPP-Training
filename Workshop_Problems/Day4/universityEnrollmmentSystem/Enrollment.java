package universityEnrollmmentSystem;

public class Enrollment {
    private Course course;
    private Double grade = null;

    public Enrollment(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}


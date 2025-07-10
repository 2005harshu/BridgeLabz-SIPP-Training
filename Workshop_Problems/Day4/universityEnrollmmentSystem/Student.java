package universityEnrollmmentSystem;

import java.util.*;

public abstract class Student {
    protected String name;
    protected int id;
    private double gpa;
    private List<Enrollment> transcript;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.transcript = new ArrayList<>();
        this.gpa = 0.0;
    }

    public void enrollInCourse(Course course) {
        transcript.add(new Enrollment(course));
    }

    public List<Enrollment> getTranscript() {
        return transcript;
    }

    private void updateGPA() {
        double total = 0;
        int count = 0;
        for (Enrollment e : transcript) {
            if (e.getGrade() != null) {
                total += e.getGrade();
                count++;
            }
        }
        this.gpa = count > 0 ? total / count : 0.0;
    }

    public double getGPA() {
        updateGPA();
        return gpa;
    }

    public abstract String getLevel();
}


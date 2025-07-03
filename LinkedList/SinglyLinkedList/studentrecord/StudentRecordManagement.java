package studentrecord;

public class StudentRecordManagement {
	 Student head = null;

	    // Add a student at specific position: 0 (begin), -1 (end), pos (specific index)
	    public void addStudent(int rollNumber, String name, int age, String grade, int position) {
	        Student newStudent = new Student(rollNumber, name, age, grade);

	        if (position == 0 || head == null) { // Add at beginning
	            newStudent.next = head;
	            head = newStudent;
	            return;
	        }

	        Student current = head;
	        int index = 1;

	        if (position == -1) { // Add at end
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newStudent;
	        } else {
	            while (index < position && current.next != null) {
	                current = current.next;
	                index++;
	            }
	            newStudent.next = current.next;
	            current.next = newStudent;
	        }
	    }

	    // Delete student by Roll Number
	    public void deleteStudent(int rollNumber) {
	        if (head == null) return;

	        if (head.rollNumber == rollNumber) {
	            head = head.next;
	            return;
	        }

	        Student current = head;
	        while (current.next != null && current.next.rollNumber != rollNumber) {
	            current = current.next;
	        }

	        if (current.next != null) {
	            current.next = current.next.next;
	        }
	    }

	    // Search by Roll Number
	    public void searchStudent(int rollNumber) {
	        Student current = head;
	        while (current != null) {
	            if (current.rollNumber == rollNumber) {
	                System.out.println("Found: Roll No: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Student with Roll Number " + rollNumber + " not found.");
	    }

	    // Display all students
	    public void displayAll() {
	        Student current = head;
	        if (current == null) {
	            System.out.println("No student records.");
	            return;
	        }

	        while (current != null) {
	            System.out.println("Roll No: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
	            current = current.next;
	        }
	    }

	    // Update grade by Roll Number
	    public void updateGrade(int rollNumber, String newGrade) {
	        Student current = head;
	        while (current != null) {
	            if (current.rollNumber == rollNumber) {
	                current.grade = newGrade;
	                System.out.println("Grade updated for Roll Number " + rollNumber);
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Student with Roll Number " + rollNumber + " not found.");
	    }
}

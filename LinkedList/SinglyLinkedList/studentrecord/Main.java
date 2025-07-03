package studentrecord;

public class Main {
	public static void main(String[] args) {
        StudentRecordManagement list = new StudentRecordManagement();

        list.addStudent(1, "Harshita", 20, "A", -1);
        list.addStudent(2, "Aman", 21, "B", -1);
        list.addStudent(3, "Riya", 19, "A", 0);
        list.displayAll();

        list.searchStudent(2);
        list.updateGrade(2, "A+");
        list.deleteStudent(1);
        list.displayAll();
    }
}

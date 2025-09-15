class Student {
    String name;
    public Student() {
        this.name = "Default Student";
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = Student.class;
        Student s = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Student created: " + s.name);
    }
}

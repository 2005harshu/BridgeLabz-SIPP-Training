package HierarchicalInheritance.SchoolManagement;

public class Main {
	public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Roy", 40, "Mathematics");
        Student s = new Student("Ananya", 15, "10th Grade");
        Staff st = new Staff("Meena", 35, "Administration");

        t.displayCommonInfo();
        t.displayRole();
        System.out.println("----");

        s.displayCommonInfo();
        s.displayRole();
        System.out.println("----");

        st.displayCommonInfo();
        st.displayRole();
    }

}

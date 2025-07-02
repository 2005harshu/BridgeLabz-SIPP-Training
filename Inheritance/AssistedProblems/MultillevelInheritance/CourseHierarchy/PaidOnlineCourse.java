package MultillevelInheritance.CourseHierarchy;

public class PaidOnlineCourse extends OnlineCourse {
	double fee;
    double discount; // in %

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee + ", Discount: " + discount + "%");
    }

}

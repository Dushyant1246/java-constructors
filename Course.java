public class Course {
    // Instance variables
    private String courseName;
    private int duration;
    private int fee;
    // Class variables
    private static String instituteName = "";

    // Parameterized constructor
    Course(String courseName, int duration, int fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public int getFee() {
        return fee;
    }

    public static String getInstituteName() {
        return instituteName;
    }

    // Class Method to update institution name
    public static void updateInstituteName(String instituteName) {
        Course.instituteName = instituteName;
    }

    // Instance Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + this.getCourseName());
        System.out.println("Duration: " + this.getDuration() + " years");
        System.out.println("Fee: " + this.getFee());
        System.out.println("Institute Name: " + Course.getInstituteName());
    }
}
/*
Course course = new Course("MCA", 2, 75000);
Course.updateInstituteName("Chitkara University");
course.displayCourseDetails();

Course Name: MCA
Duration: 2 years
Fee: 75000
Institute Name: Chitkara University
 */
package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        // i. Display student name and student ID
        String studentName = "NurFarisha";
        String studentId = "S85454";
        
        System.out.println("=== Student Information System ===");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID  : " + studentId);
        System.out.println("----------------------------------");

        // ii. Store two marks using variables
        double mark1 = 85.5;
        double mark2 = 78.0;

        // iii. Calculate the total mark
        double totalMark = mark1 + mark2;

        // iv. Display the total (Assuming a max total of 200, or adjust as needed)
        System.out.println("Mark 1    : " + mark1);
        System.out.println("Mark 2    : " + mark2);
        System.out.println("Total Mark: " + totalMark);
        System.out.println("----------------------------------");

        // v. Display a message based on the total
        System.out.print("Result Status: ");
        if (totalMark >= 160) {
            System.out.println("Excellent");
        } else if (totalMark >= 120) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
        System.out.println("==================================");
    }
}
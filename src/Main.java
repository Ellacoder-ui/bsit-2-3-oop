import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collect Student Information
        System.out.println("Hello! Please enter your student information.");

        System.out.println("Student ID:");
        String studentId = input.nextLine();

        System.out.println("First Name:");
        String firstName = input.nextLine();

        System.out.println("Last Name:");
        String lastName = input.nextLine();

        System.out.println("Course:");
        String course = input.nextLine();

        System.out.println("Section:");
        String section = input.nextLine();

        // Display Student Information
        System.out.println();
        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        // Collect Scores
        System.out.println();
        System.out.println("Midterm Exam Score:");
        int midtermScore = input.nextInt();

        System.out.println("Final Exam Score:");
        int finalScore = input.nextInt();

        System.out.println("Project Score:");
        int projectScore = input.nextInt();

        System.out.println("Attendance Percentage:");
        int attendanceScore = input.nextInt();

        // Calculate Average
        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = totalScore / 4.0;

        String remarks;
        if (averageScore >= 75) {
            remarks = "PASSED";
        } else {
            remarks = "FAILED";
        }

        // Display Scores and Result
        System.out.println();
        System.out.println("STUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println();
        System.out.println("Average Score: " + averageScore);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}

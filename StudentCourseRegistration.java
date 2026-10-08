import java.util.Scanner;

class Student {
    String studentName;
    int rollNumber;
    int marks;
    String courseName;
    int courseCredits;

    // Parameterized constructor
    Student(String studentName, int rollNumber, int marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Calculate fee (Rs. 1500 per credit)
    double calculateFee() {
        return courseCredits * 1500;
    }

    // Check eligibility (marks >= 50)
    boolean checkEligibility() {
        return marks >= 50;
    }

    // Scholarship calculation
    double calculateScholarship(double fee) {
        if (marks >= 85) {
            return fee * 0.20; // 20% scholarship
        } else if (marks >= 70) {
            return fee * 0.10; // 10% scholarship
        } else {
            return 0; // No scholarship
        }
    }

    // Final fee after scholarship
    double calculateFinalFee(double fee, double scholarship) {
        return fee - scholarship;
    }

    // Display details
    void displayDetails() {
        double fee = calculateFee();
        double scholarship = calculateScholarship(fee);
        double finalFee = calculateFinalFee(fee, scholarship);

        System.out.println("\n===== Student Course Registration Details =====");
        System.out.println("Student Name   : " + studentName);
        System.out.println("Roll Number    : " + rollNumber);
        System.out.println("Marks          : " + marks);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Course Credits : " + courseCredits);
        System.out.println("Eligibility    : " + (checkEligibility() ? "Eligible" : "Not Eligible"));
        System.out.println("Total Fee      : Rs. " + fee);
        System.out.println("Scholarship    : Rs. " + scholarship);
        System.out.println("Final Fee      : Rs. " + finalFee);
    }
}

public class StudentCourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();

        // Create student object
        Student s = new Student(name, roll, marks, course, credits);

        // Check eligibility
        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("\n Student is not eligible for registration (marks below 50).");
        }

        sc.close();
    }
}

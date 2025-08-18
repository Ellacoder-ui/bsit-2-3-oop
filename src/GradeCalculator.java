public class GradeCalculator {

    
    public double calculateAverage(double... grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum /4; //average
    }

     // iyang letter grade
    public String getLetterGrade(double average) {
        if (average >= 90 && average <= 100) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // pag display sa all
    public void displayResult(String studentName, double average) {
        System.out.println("Student: " + studentName + ", Average: " + average);
    }


    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.println("Student: " + studentName + ", Average: " + average + ", Grade: " + letterGrade);
    }
}


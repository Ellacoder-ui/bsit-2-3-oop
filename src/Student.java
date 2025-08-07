class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1, grade2, grade3;

    // Constructor
    public Student(String Name, int Age, String Course, double Grade1, double Grade2, double Grade3) {
        name = Name;
        age = Age;
        course = Course;
        grade1 = Grade1;
        grade2 = Grade2;
        grade3 = Grade3;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // Method to calculate average
    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    // Method to get letter grade
    public String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to check if student is passing
    public boolean isPassing() {
        double avg = calculateAverage();
        if (avg >= 70) {
            return true;
        } else {
            return false;
        }
    }
}


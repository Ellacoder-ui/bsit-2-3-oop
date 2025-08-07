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


    public void displayInfo() {
        System.out.println("Name: " + name +","+ "Age: " + age +"," + "Course: " + course);
        System.out.println("Grades:" + grade1 + " ,"  + grade2 +" ,"  + grade3);
    }


    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

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


    public boolean isPassing() {
        double avg = calculateAverage();
        if (avg >= 70) {
            return true;
        } else {
            return false;
        }
    }
}


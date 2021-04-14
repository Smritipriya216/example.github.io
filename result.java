class StudentData {
    int stuID;
    String stuName;

    StudentData() {
        // Default constructor
        stuID = 100;
        stuName = "New Student";
    }

    StudentData(int num1, String str) {
        // Parameterized constructor
        stuID = num1;
        stuName = str;
    }

    void display() {
        System.out.println("Student Name is: " + stuName);
        System.out.println("Student ID is: " + stuID);
    }
}

class result {
    public static void main(String[] args) {
        StudentData S1 = new StudentData();
        StudentData S2 = new StudentData(101, "New Student 2.0");
        S1.display();
        S2.display();
    }
}
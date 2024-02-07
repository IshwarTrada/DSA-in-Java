// deep copy constructor
// deep copy : it copy the whole object and create its own memory space instead of referring object like shallow copy

public class DeepCopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ishwar";
        s1.roll = 162;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        // print marks of s2
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Non parameterized constructor called...");
    }

}
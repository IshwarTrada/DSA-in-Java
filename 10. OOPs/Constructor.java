// Constructor
// Types of Constructor(3)
//      Covered Constructor types in this program are : Non-Parameterized and Parameterized
// Constructor Overloading

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Hello");
        Student s3 = new Student(162);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Non-Parameterized Constructor");
    }

    Student(String name) {
        System.out.println("Parameterized Constructor");
        System.out.println(name);
    }
    
    Student(int roll) {
        System.out.println("Parameterized Constructor and Constructor Overloading");
        System.out.println(roll);
    }
}
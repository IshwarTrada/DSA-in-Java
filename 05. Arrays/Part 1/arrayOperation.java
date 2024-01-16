// Topic 1 : Operation in Arrays

import java.util.*;

public class arrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array
        int marks[] = new int[100];
        // int numbers[] = {1,2,3};
        // String fruits[] = {"apple", "orange", "mango"};
        // Input in array
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // Output in array
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        // Update in array
        marks[2] = marks[2] + 1;
        // marks[2] = 88;
        System.out.println("Updated Maths marks");
        System.out.println("Maths : " + marks[2]);

        // Arithmetic calculation
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage : " + percentage + "%");

        // Length of array
        System.out.println("Length of array : " + marks.length);
    }
}
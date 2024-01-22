
// String Creation Methods
// Strings are Immutable
// Input/Output String
// String length
// String Concatenation

import java.util.*;

public class StringIntro {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        // 2 Method for create string
        String str = "abcd";
        String str1 = new String("xyz");

        // Input/Output
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String name;
        // Take one word only
        name = sc.next();
        System.out.println(name);
        sc.nextLine(); // Consume the newline character

        // Take whole line
        System.out.print("Enter a line : ");
        String line;
        line = sc.nextLine();
        System.out.println(line);

        // String Length
        System.out.println("Entered sentence length is " + line.length());

        // String Concatenation
        String firstName = "Ishwar";
        String lastName = "Trada";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // charAt - Give a specific index character from a given Staring
        System.out.println(fullName.charAt(0));
        printLetter(fullName);

    }
}
// Introduction to ArrayList
// Operations of ArrayList

import java.util.*;
// or
// import java.util.ArrayList;

public class p1{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();        
        ArrayList<String> list2 = new ArrayList<>();        
        ArrayList<Boolean> list3 = new ArrayList<>();  
        
        // Operations
        // Add element - O(1)
        System.out.println("Add element - O(1)");
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        list1.add(1,12);
        System.out.println(list1);

        // Get element - O(1)
        System.out.println("\nGet element - O(1)");
        System.out.println(list1.get(2));

        // Remove element - O(n)
        System.out.println("\nRemove element - O(n)");
        System.out.println("Before remove list is :");
        System.out.println(list1);
        list1.remove(1);
        System.out.println("After remove element from list is :");
        System.out.println(list1);

        // Set element at index - O(n)
        System.out.println("\nSet element at index - O(n)");
        System.out.println("Before set element at index");
        System.out.println(list1);
        list1.set(2, 10);
        System.out.println("after set element at index");
        System.out.println(list1);

        // Contains element - O(n)
        System.out.println("\nContains element - O(n)");
        System.out.println(list1);
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(12));

    }
}
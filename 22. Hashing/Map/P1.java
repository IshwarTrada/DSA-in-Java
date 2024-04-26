// HashMap Operation

import java.util.*;

public class P1 {

    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm); // {China=150, US=50, India=100}

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population); // 100

        System.out.println(hm.get("Indonesia")); // null

        // containsKey - O(1)
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonesia")); // false

        // remove - O(1)
        System.out.println(hm.remove("China")); // 150
        System.out.println(hm); // {US=50, India=100}

        // size
        System.out.println(hm.size()); // 2

        // isEmpty
        System.out.println(hm.isEmpty()); // false

        // clear whole hashMap
        hm.clear();
        System.out.println(hm.isEmpty()); // true
    }
}
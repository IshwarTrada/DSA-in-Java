// Iteration on HashMap

import java.util.*;

public class P2 {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys); // [China, US, Nepal, India, Indonesia]
        System.out.println();

        for (String key : keys) {
            System.out.println("Keys : "+key);
            System.out.println("Value : "+hm.get(key));
            System.out.println();
        }
    }
}

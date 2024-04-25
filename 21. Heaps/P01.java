// Priority Queue in JCF

import java.util.*;

public class P01 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default ascending priority
        
        pq.add(3); // O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);
        
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1)
            pq.remove(); // O(logn)
        }
        System.out.println();

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); // change priority to descending order
        pq1.add(3); // O(logn)
        pq1.add(4);
        pq1.add(1);
        pq1.add(7);
        
        while (!pq1.isEmpty()) {
            System.out.print(pq1.peek() + " "); // O(1)
            pq1.remove(); // O(logn)
        }
    }
}

// Output : 1 3 4 7 ----> default priority
// Output : 7 4 3 1 ----> descending priority
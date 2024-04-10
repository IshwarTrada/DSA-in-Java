// Double Ended Queue (Deque) using Java Collections Framework

import java.util.*;

public class p11 {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); // 1
        deque.addFirst(2); // 2 1

        deque.addLast(3); // 2 1 3
        deque.addLast(4); // 2 1 3 4
        System.out.println(deque); // [2, 1, 3, 4]

        deque.removeFirst();
        System.out.println(deque); // [1, 3, 4]

        deque.removeLast();
        System.out.println(deque); // [1, 3]

        System.out.println("First element : " + deque.getFirst()); // 1
        System.out.println("Last element : " + deque.getLast());   // 3
    }
}

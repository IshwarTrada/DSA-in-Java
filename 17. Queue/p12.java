// Stack using Deque

import java.util.*;

public class p12 {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // push
        public void push(int data) {
            deque.addLast(data);
        }

        // pop
        public int pop() {
            return deque.removeLast();
        }

        // peek
        public int peek() {
            return deque.getLast();
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek of Stack : "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}

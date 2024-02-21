// Linked Lists
// Reverse a Linked List (Iterative Approach)
// Remember technique -> 3 variables and 4 steps

public class p5 {
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Main Method
    public static void main(String[] args) {
        p5 ll = new p5();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

        ll.reverse();
        ll.print(); // 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> null
    }

    // Print Linked List - Time Complexity - O(n)
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Creation of Node with the help of class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size; // by default java give value as 0, so we don't have to declare it

    // add Last - Time Complexity --> O(1)
    public void addLast(int data) {
        // Step - 1 Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step - 2 tail next = newNode
        tail.next = newNode;

        // Step - 3 tail = newNode
        tail = newNode;
    }
}
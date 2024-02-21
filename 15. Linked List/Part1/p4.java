// Linked Lists
// Iterative search

public class p4 {
    public int helper(Node head, int key) { // O(n)
        // Base case
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Main Method
    public static void main(String[] args) {
        p4 ll = new p4();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

        int key = 3;
        System.out.println("---------Recursive Search---------");
        if (ll.recSearch(key) == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println("Element found at " + ll.recSearch(key) + " index.");
        }

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
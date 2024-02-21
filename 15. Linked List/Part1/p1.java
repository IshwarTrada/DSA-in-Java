// Linked Lists
// Create Node
// Add -> First position
//     -> Last position
//     -> Any position
// Print Linked Lists
// Size of Linked List 
public class p1 {
    // Print Linked List - Time Complexity - O(n)
    public void print() {
        // Base case
        // if (head == null) {
        // System.out.println("Linked List is empty");
        // return;
        // }

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

    // add First - Time Complexity --> O(1)
    public void addFirst(int data) {
        // Step - 1 Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step - 2 newNode next = head
        newNode.next = head;

        // Step - 3 newNode head = newNode
        head = newNode;
    }

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

    // add Middle - Time Complexity --> O(n)
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;

        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        // i = index - 1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        p1 ll = new p1();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2, 9);
        ll.print(); // 1 -> 2 -> 9 -> 3 -> 4 -> null

        // Size of LinkedList
        System.out.println("Size of Linked List is " + ll.size);
    }
}
// Linked List
// Remove Operation -> Find and Remove Nth node from End (Iterative Approach)

public class p6 {
    public void deleteNthfromEnd(int n) {
        // Calculate size - (For coding questions we have to calculate size, we already
        // calculte size in this program but how we calculate in coding questions for
        // that we again calculate size)
        int sz = 0; // size
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // Remove first element
        if (n == sz) {
            head = head.next;
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Main Method
    public static void main(String[] args) {
        p6 ll = new p6();
        ll.addLast(11);
        ll.addLast(22);
        ll.addLast(33);
        ll.addLast(44);
        ll.addLast(55);
        ll.addLast(66);
        ll.print(); // 11 -> 22 -> 33 -> 44 -> 55 -> 66 -> null

        ll.deleteNthfromEnd(3); // delete node 3 from end , Here it is 44
        ll.print(); // 11 -> 22 -> 33 -> 55 -> 66 -> null
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
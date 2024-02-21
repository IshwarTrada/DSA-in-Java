// Linked List
// Check if Linked List is Palindrome or not

public class p7 {
    // Slow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move by +1
            fast = fast.next.next; // move by +2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        // Linked List is empty or 1 node
        if (head == null || head.next == null) {
            return true;
        }
        // step - 1 : find mid
        Node midNode = findMid(head);

        // step - 2 : reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // step - 3 : check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {
        p7 ll = new p7();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print(); // 1 -> 2 -> 2 -> 1 -> null

        System.out.println(ll.checkPalindrome());

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
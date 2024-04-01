// Doubly LinkedList
// Operations : 
//          Add     => add element at first position
//                  => add element at last position
//          Remove  => remove first element 
//                  => remove last element 
//          Print Doubly LinkedList

public class p6 {
    // Creation of Node with the help of class
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // print
    public void print() {
        Node temp = head;
        System.out.print("null <- ");
        while (temp != null) {
            if (temp != tail) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            } else {
                System.out.println(temp.data + " -> null");
                temp = temp.next;
            }

        }
    }

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next = null;
    }

    // remove
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;

    }

    public static void main(String[] args) {
        p6 dll = new p6();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        
        dll.print();        // null <- 1 <-> 2 <-> 3 <-> 4 <-> 5 -> null
        System.out.println(dll.size);

        dll.removeFirst();
        dll.print();        // null <- 2 <-> 3 <-> 4 <-> 5 -> null
        System.out.println(dll.size);

        dll.addLast(6);
        dll.print();        // null <- 2 <-> 3 <-> 4 <-> 5 <-> 6 -> null
        System.out.println(dll.size);
        
        dll.removeLast();
        dll.print();        // null <- 2 <-> 3 <-> 4 <-> 5 -> null
        System.out.println(dll.size);

    }

}

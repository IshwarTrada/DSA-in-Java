// Reverse a Doubly LinkedList

public class p7 {

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        tail = curr;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        p7 dll = new p7();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();        // null <- 1 <-> 2 <-> 3 <-> 4 <-> 5 -> null

        dll.reverse();
        dll.print();        // null <- 5 <-> 4 <-> 3 <-> 2 <-> 1 -> null
    }
    


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
        System.out.print("\nnull <- ");
        while (temp != null) {
            if (temp != tail) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            } else {
                System.out.print(temp.data);
                temp = temp.next;
            }  
        }
        System.out.print(" -> null");
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

}

// Queue using Linked List
// Queue Operations (Add - O(1), Remove - O(1), Peek(front/head of queue) - O(1))

public class p3 {
    // Create Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add data in queue
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove data from queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;

            // single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek data from queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        // 1 2 3

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

// Circular Queue using Array
// Queue Operations (Add - O(1), Remove - O(1), Peek(front/head of queue))

public class p2 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Queue is Empty or not
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Queue is Full or not
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add data in queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            // add 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove data from queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            // last element delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        // 1 2 3

        System.out.println(q.remove()); // x 2 3
        q.add(4);                  // 4 2 3
        System.out.println(q.remove()); // 4 x 3
        q.add(5);                  // 4 5 2
        
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// Insert , Peek , Remove in maxHeap

import java.util.*;

public class P04 {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // insert
        public void add(int data) {// O(logn)
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) > arr.get(par)) {
                // swap
                int tmp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, tmp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        // peek
        public int peek() {
            return arr.get(0);
        }

        // heapify function - O(log n)
        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            if (left < arr.size() && arr.get(minIdx) < arr.get(left)) {
                minIdx = left;
            }

            if (right < arr.size() && arr.get(minIdx) < arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != idx) {
                // swap
                int tmp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, tmp);

                heapify(minIdx);
            }
        }

        // remove
        public int remove() {
            int data = arr.get(0);

            // step - 1 -> swap first and last element
            int tmp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, tmp);

            // step - 2 -> delete last element
            arr.remove(arr.size() - 1);

            // step - 3 -> heapify
            heapify(0); // O(log n)
            return data;

        }

        // Heap is Empty or not
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
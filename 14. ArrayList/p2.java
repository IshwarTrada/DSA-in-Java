// ArrayList - Size property
// print reverse ArrayList

import java.util.ArrayList;

public class p2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        System.out.println("Size of ArrayList: " + list1.size());

        // print arraylist - O(n)
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        
        // print reversed arraylist - O(n)
        for (int i = list1.size()-1; i >=0; i--) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }
}

// For a fiven set of Strings print the largest string (Lexicographic)
// Time Complexity : O(x*N) where x = largest string length , N = No. of Strings

public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "banana", "mango"};
        
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest =fruits[i];
            }
        }
        System.out.println(largest);
    }
}

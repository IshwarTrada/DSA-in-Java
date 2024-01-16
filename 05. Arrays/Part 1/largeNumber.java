// Topic 4 : Largest Number from given array

public class largeNumber {
    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is " + smallest);
        return largest;
    }
    
    public static void main(String[] args) {
        int numbers[] = { 10, 25, 34, 12, 8 };
        System.out.println("Largest number is " + largestNumber(numbers));
    }
}

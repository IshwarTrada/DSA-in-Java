// Topic 6 : Reverse an array without creating another array

public class reversingArray {
    public static void reverseArray(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Revere of an array is :");
        reverseArray(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

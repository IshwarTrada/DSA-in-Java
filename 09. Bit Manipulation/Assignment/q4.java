// Convert uppercase characters to lowercase using bits
// ASCII value of ' ' is 32
// ASCII value of 'A' is 65

public class q4 {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
        }
    }

}

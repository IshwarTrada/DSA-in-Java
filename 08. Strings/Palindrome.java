// String is Palindrome or not
// Palindrome example : racecar, noon, madam
// Time Complexity : O(n)

public class Palindrome {
    public static boolean isPalindrome(String str){
        for (int i = 0; i <str.length()/2; i++) {
            int n = str.length();
            // not palindrome
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }   
}

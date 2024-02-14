// Find Permutation
// Time Complexity : O(n * n!)

public class p3 {

    public static void findPermutation(String str, String ans) {
        // Base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }


        for (int j = 0; j < str.length(); j++) {
            char curr = str.charAt(j);
            String newStr = str.substring(0, j)+str.substring(j+1);
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}

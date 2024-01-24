// String Functions - Compare
// Difference between String creation with and without new Keyword
// Usecase of (str1.equals(str2))

public class FunctionCompare {
    public static void main(String[] args) {
        String s1 = "Ishwar";
        String s2 = "Ishwar";
        String s3 = new String("Ishwar");

        if (s1==s2) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are different");
        }

        if (s1==s3) {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are different");
        }

        if (s1.equals(s3)) {
            System.out.println("\nStrings are equal");
        }
        else{
            System.out.println("Strings are different");
        }
    }   
}

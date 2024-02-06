// Remove duplicate from string
// Constraint : string contains a-z characters not special characters

public class RemoveDuplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        // Base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

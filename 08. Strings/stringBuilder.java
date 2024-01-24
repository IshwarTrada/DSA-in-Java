public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        // O(26)
        // In case of String : O(n^2)
        System.out.println(sb);
        System.out.println(sb.getClass().getSimpleName());
        System.out.println(sb.length());
        
        String str = sb.toString();
        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());
    }
}

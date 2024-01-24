public class q5 {
    public static void internMethod() {
        String s1 = "Hello";
        String s2 = s1.intern();
        String s3 = new String("Hello");
        String s4 = s3.intern();
        System.out.println(s1 == s2); // True
        System.out.println(s1 == s3); // False
        System.out.println(s1 == s4); // True
        System.out.println(s2 == s3); // False
        System.out.println(s2 == s4); // True
        System.out.println(s3 == s4); // False
        System.out.println("\n");
    }

    public static void AppendStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");// now original string is changed
        System.out.println(sb);// prints Hello Java
    }

    public static void InsertStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");// now original string is changed
        System.out.println(sb);// prints HJavaello
    }

    public static void ReplaceStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);// prints HJavalo
    }

    public static void DeleteStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);// prints Hlo
    }

    public static void main(String args[]) {
        System.out.println("Intern Method");
        internMethod();
        System.out.println("StringBuffer Method");
        AppendStringBuffer();
        InsertStringBuffer();
        ReplaceStringBuffer();
        DeleteStringBuffer();
    }
}

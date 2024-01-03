import java.util.Scanner;

/* Calculator using switch */
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter first value : ");
        int a = sc.nextInt();
        System.out.print("Enter second value : ");
        int b = sc.nextInt();
        System.out.print("Enter Operator (+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
        
            default:
                System.out.println("Calculator is not that much advanced which can perform " + operator + " operation.");
        }
        System.out.println();
    }   
}
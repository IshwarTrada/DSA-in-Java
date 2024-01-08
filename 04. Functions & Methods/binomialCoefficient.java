
// Binomial coefficient
// nCr =   n!
//      --------
//      r!(n-r)!
import java.util.*;

public class binomialCoefficient {
    public static int factorialOfNum(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorialOfNum(n);
        int r_fact = factorialOfNum(r);
        int nmr_fact = factorialOfNum(n - r);
        int ans = n_fact / (r_fact * nmr_fact);
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Binomial Coefficient");
            System.out.println("Enter value of n : ");
            int n = sc.nextInt();
            System.out.println("Enter value of r : ");
            int r = sc.nextInt();
            int ans = binCoeff(n, r);
            System.out.println(ans);
        }
    }
}

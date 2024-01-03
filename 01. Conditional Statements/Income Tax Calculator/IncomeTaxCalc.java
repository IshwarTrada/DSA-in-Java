import java.util.Scanner;

/* IncomeTaxCalc */
public class IncomeTaxCalc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float income, tax;

            // Tax charges instructions
            System.out.println("\n0% tax on income below 5 lac.");
            System.out.println("20% tax on income between 5 lac and 10 lac.");
            System.out.println("30% tax on income above 10 lac");
            
            // input of income
            System.out.print("\nEnter your income : ");
            income = sc.nextFloat();

            if (income < 500000) {
                tax = 0;
            } else if (income >= 500000 && income <= 1000000) {
                tax = income * 0.2f;
            } else {
                tax = income * 0.3f;
            }
            System.out.println("You have to pay " + tax + " rs tax.\n");
        }
    }
}
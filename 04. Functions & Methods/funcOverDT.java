// func overloading using datatypes

public class funcOverDT {

    // func to calculate int sum
    public static int sum(int x, int y) {
        return x + y;
    }

    // func to calculate double sum
    public static double sum(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.2, 5.3));
    }
}

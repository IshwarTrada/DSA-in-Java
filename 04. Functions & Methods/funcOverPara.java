// func overloading using parameters

public class funcOverPara {
    // func to calculate sum of 2 numbers
    public static int sum(int x, int y) {
        return x + y;
    }

    // func to calculate sum of 3 numbers
    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3, 5, 8));
    }
}

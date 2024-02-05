// Problem 5 : Print nth fibonacci number using recursion

public class p5 {
    public static int fib(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1){
            return n;
        }
        return (fib(n-1) + fib(n-2));
    }
    public static void main(String[] args) {
        int n = 35;
        if(fib(n)==-1){
            System.out.println("Error to find fibonacci number at " +n+"th place due to it is negative.");
        }
        else{
            System.out.println(fib(n));
        }  
    }
}

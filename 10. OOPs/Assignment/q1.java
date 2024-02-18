
// Print the sum, difference and product of two complex numbers by creating a
// class named 'Complex' with separate methods for each operation whose real and imaginary
// parts are entered by the user.
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number : ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number : ");
        int i1 = sc.nextInt();
        System.out.print("Enter real part of second complex number : ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number : ");
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex addComplex = Complex.add(c1, c2);
        Complex subComplex = Complex.sub(c1, c2);
        Complex mulComplex = Complex.mul(c1, c2);

        addComplex.printComplex();
        subComplex.printComplex();
        mulComplex.printComplex();
    }
}

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex sub(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex mul(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }
}
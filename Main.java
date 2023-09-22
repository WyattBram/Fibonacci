import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        FibIteration a = new FibIteration();
        FibFormula b = new FibFormula();

        System.out.println("Enter the number you want to find the Fibonacci Series for: ");
        int c = x.nextInt();
        System.out.println("Fib of " + c +  " by iteration is: " + a.calculateFIb(c));
        System.out.println("Fib of " + c + " by formula is: " + b.calculateFIb(c));
    }
}




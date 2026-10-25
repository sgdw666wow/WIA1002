import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double grams = sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double fInitial = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double fFinal = sc.nextDouble();

        double M = grams / 1000.0;
        double cInitial = (fInitial - 32) / 1.8;
        double cFinal = (fFinal - 32) / 1.8;
        double Q = M * (cFinal - cInitial) * 4184;

        System.out.printf("The energy needed is %e%n", Q);
    }
}

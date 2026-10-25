import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the car (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter the down payment (D): ");
        double D = sc.nextDouble();
        System.out.print("Enter the interest rate in % (R): ");
        double R = sc.nextDouble();
        System.out.print("Enter the loan duration in years (Y): ");
        int Y = sc.nextInt();
        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        System.out.printf("The monthly payment is RM %.2f%n", M);
    }
}

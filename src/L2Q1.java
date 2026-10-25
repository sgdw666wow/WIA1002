import java.util.Scanner;

public class L2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
    }
}

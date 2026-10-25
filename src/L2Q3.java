public class L2Q3 {
    public static void main(String[] args) {
        int n1 = 10 + (int) (Math.random() * 41);
        int n2 = 10 + (int) (Math.random() * 41);
        int n3 = 10 + (int) (Math.random() * 41);
        int sum = n1 + n2 + n3;
        double average = sum / 3.0;
        System.out.println("The three numbers are: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("The sum is: " + sum);
        System.out.printf("The average is: %.2f%n", average);
    }
}

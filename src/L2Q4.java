import java.util.Scanner;

public class L2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n",
                seconds, hours, minutes, secs);
    }
}

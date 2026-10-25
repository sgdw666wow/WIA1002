public class L2Q5 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10001);
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("The random number is: " + number);
        System.out.println("The sum of all digits is: " + sum);
    }
}

public class L2Q7 {
    public static void main(String[] args) {
        int matric = 25007586;
        double num = 9345678.0;

        System.out.println();
        System.out.println("Matric number: " + matric);
        System.out.printf("Same number: %.1f%n", num);
        System.out.println();

        System.out.printf("01. %%e        |%e|%n", num);
        System.out.printf("02. %%015.2f   |%015.2f|%n", num);
        System.out.printf("03. %%.1f      |%.1f|%n", num);
        System.out.printf("04. %%a        |%a|%n", num);
        System.out.printf("05. %%,.2f     |%,.2f|%n", num);
        System.out.printf("06. %%.4f      |%.4f|%n", num);
        System.out.printf("07. %%-15.2f  |%-15.2f|%n", num);
        System.out.printf("08. %%E        |%E|%n", num);
        System.out.printf("09. %%f        |%f|%n", num);
        System.out.printf("10. %%+.2f     |%+.2f|%n", num);
        System.out.printf("11. %%.0f      |%.0f|%n", num);
        System.out.printf("12. %%.3g      |%.3g|%n", num);
        System.out.printf("13. %%15.2f    |%15.2f|%n", num);
        System.out.printf("14. %%.3e      |%.3e|%n", num);
        System.out.printf("15. %%.2f      |%.2f|%n", num);
    }
}

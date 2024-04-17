import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = Double.valueOf(scanner.nextDouble());
        double b = Double.valueOf(scanner.nextDouble());

        System.out.println(Math.pow(a, b));
    }
}
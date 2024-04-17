import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double p=(a+b+c)/2;
        double result = p*(p-a)*(p-b)*(p-c);

        System.out.println(Math.sqrt(result));
    }
}
import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        // write your code here
        int vall=0;
        if (val == null) {
           vall=0; 
        } else if (val>Integer.MAX_VALUE) {
            vall=Integer.MAX_VALUE;
        }else if (val<Integer.MIN_VALUE) {
            vall=Integer.MIN_VALUE;
        }else vall =Math.toIntExact(val);
        return vall;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}
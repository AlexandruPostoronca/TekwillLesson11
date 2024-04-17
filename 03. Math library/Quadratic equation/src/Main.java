import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();

        if(a<1 && a>0){
            a=a*10;
            b=b*10;
            c=c*10;
        }else if(a<0){
            a=a*(-1);
            b=b*(-1);
            c=c*(-1);
        }
        //ax2+bx+c=0
        double delta=Math.pow(b,2)-4*a*c;
        double sqrt=Math.sqrt(delta);
        double x2=(-b-sqrt)/(2*a);
        double x1=(-b+sqrt)/(2*a);

        System.out.println(x2+" "+x1);
    }
}
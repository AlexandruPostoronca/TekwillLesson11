public class Main {
    public static void main(String[] args) {
        // Write your solution here
        Month[] month = Month.values();
        for(Month text:month ){
            System.out.print(text+" ");
        }
        System.out.println();
        Month aug = Month.AUG;
        System.out.println(aug);
        Month dec1 = Month.DEC;
        Month dec2 = Month.DEC;
        boolean equilse = dec1==dec2;
        System.out.println(equilse);
        System.out.println(Month.JAN.getNumber());
        System.out.println(Month.valueOf("JUN"));
    }

    public enum Month {
        JAN(1),
        FEB(2),
        MAR(3),
        APR(4),
        MAY(5),
        JUN(6),
        JUL(7),
        AUG(8),
        SEP(9),
        OCT(10),
        NOV(11),
        DEC(12);

        Month(int number) {
            this.number = number;
        }

        private final int number;

        public int getNumber() {
            return number;
        }
    }
}
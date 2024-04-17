public class Main {
   public static void main(String[] args) {
      // Write your solution here
      System.out.println(Direction.NORTH.name() );
      System.out.println(Direction.NORTH.getShortCode());
      System.out.println(Direction.NORTH.toString());
      System.out.println(Direction.valueOf("NORTH"));

   }
   enum Direction {
      EAST("E"),
      WEST("W"),
      NORTH("N"),
      SOUTH("S");

      private final String shortCode;

      Direction(String code) {
         this.shortCode = code;
      }

      public String getShortCode() {
         return this.shortCode;
      }
   }
}
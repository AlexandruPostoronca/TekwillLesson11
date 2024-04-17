public class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        // implement this method
        int dx = robot.getX() - toX;
        System.out.println(dx);
        if (dx != 0) {
            Direction xDirection = dx < 0 ? Direction.RIGHT : Direction.LEFT;

            while (robot.getDirection() != xDirection) {
                robot.turnRight();
            }
            int absDx = Math.abs(dx);
            for (int i = 0; i < absDx; i++) {
                robot.stepForward();
            }
        }
        int dy = robot.getY() - toY;
        if (dy != 0) {
            Direction yDirection = dy < 0 ? Direction.UP : Direction.DOWN;

            while (robot.getDirection() != yDirection) {
                robot.turnRight();
            }
            int absDy = Math.abs(dy);
            for (int i = 0; i < absDy; i++) {
                robot.stepForward();
            }
        }
    }
}
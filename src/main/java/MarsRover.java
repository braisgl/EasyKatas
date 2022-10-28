public class MarsRover {

    private static int x;
    private static int y;
    private static String orientation;

    public MarsRover(int x, int y, String orientation) {
        MarsRover.x = x;
        MarsRover.y = y;
        MarsRover.orientation = orientation;
    }

    public static String move(String command) {
        String[] moves = command.split("");
        for (String move : moves) {
            switch (move) {
                case "M":
                    moveForward();
                    break;
                case "L":
                    rotateLeft();
                    break;
                case "R":
                    rotateRight();
                    break;
            }
        }
        return x + ":" + y + ":" + orientation;
    }

    private static void rotateLeft() {
        switch (orientation) {
            case "N":
                orientation="W";
                break;
            case "S":
                orientation="E";
                break;
            case "E":
                orientation="N";
                break;
            case "W":
                orientation="S";
                break;
        }
    }

    private static void rotateRight() {
        switch (orientation) {
            case "N":
                orientation="E";
                break;
            case "S":
                orientation="W";
                break;
            case "E":
                orientation="S";
                break;
            case "W":
                orientation="N";
                break;
        }
    }

    private static void moveForward() {
        switch (orientation) {
            case "N":
                y = checkBoardLimitTopRight(y) ? 0 : y + 1;
                break;
            case "S":
                y = checkBoardLimitBottomLeft(y) ? 9 : y - 1;
                break;
        }
    }

    public static boolean checkBoardLimitTopRight(int number) {
        return number == 9;
    }

    public static boolean checkBoardLimitBottomLeft(int number) {
        return number == 0;
    }

}

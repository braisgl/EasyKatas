public class LeapYear {

    public static boolean isLeapYear(int number) {
        if (number % 4 == 0) {
            return true;
        }
        if (number % 400 == 0) {
            return true;
        }
        return false;
    }
}
import java.util.Map;

public class RomanNumerals {

    public String calculate(int number) {
        StringBuilder romanNumber = new StringBuilder();
        Map<Integer, String> numbers = Map.of(1, "I", 4, "");
        // int[];

        while (number > 0) {

            if (number >= 40 && number < 100) {
                romanNumber.append("LX");
                number -= 40;
            }

            if (number >= 10 && number < 40) {
                romanNumber.append("X");
                number -= 10;
            }

            if (number >= 9 && number < 10) {
                romanNumber.append("IX");
                number -= 9;
            }

            if (number >= 4 && number < 5) {
                romanNumber.append("IV");
                number -= 4;
            }

            if (number >= 5 && number < 9) {
                romanNumber.append("V");
                number -= 5;
            }

            if (number >= 1 && number < 4) {
                romanNumber.append("I");
                number -= 1;
            }
        }
        return romanNumber.toString();
    }
}


       /* for (int i = 1; i <= number; i++) {
            romanNumber.append("I");

            transform(romanNumber, i);
            if (i == 5) {
                romanNumber.replace(0, romanNumber.length(), "V");
            }

        }
        return romanNumber.toString();
    }

    public StringBuilder transform(StringBuilder romanNumber, int i) {

        if (romanNumber.length() >= 4) {
            if (romanNumber.toString().substring(romanNumber.length() - 4, romanNumber.length()).equals("IIII")) {
                return romanNumber.replace(romanNumber.length() - 4, romanNumber.length(), "IV");
            }
            if (romanNumber.toString().substring(romanNumber.length() - 4, romanNumber.length()).equals("VIIII")) {
                return romanNumber.replace(romanNumber.length() - 4, romanNumber.length(), "IX");
            }
        }

        return romanNumber;
    }*/



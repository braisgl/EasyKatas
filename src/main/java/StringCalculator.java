import java.util.Objects;

public class StringCalculator {


    public String operate(String numbers) {


        String separator = "";

        if (numbers.startsWith("//")) {
            String[] separatorNumbers = this.getSeparator(numbers);

            separator = separatorNumbers[0];
            numbers = separatorNumbers[1];
        }

        String[] array = numbers.split("[" + separator + ",\\n]+");

        return this.getResult(array);
    }

    public String[] getSeparator(String numbers) {
            String separator = numbers.substring(2, 3);
            String substringToDelete = numbers.substring(0, 5);
            numbers = numbers.replace(substringToDelete, "");

        return new String[]{separator, numbers};
    }

    public String getResult(String[] array) {
        int length = array.length;
        int sum = 0;

        if (length == 1) {
            if (Objects.equals(array[0], "")) {
                return "0";
            }
            return array[0];
        }

        StringBuilder err = new StringBuilder();
        for (String s : array) {

            if(s.startsWith("-")){
                err.append(s);
                err.append(" ");
            }


            if (Integer.parseInt(s) < 1000)
                sum += Integer.parseInt(s);
        }

        if (!err.toString().equals(""))
            throw new UnsupportedOperationException("error: negatives not allowed "+err.toString());

        return String.valueOf(sum);
    }
}
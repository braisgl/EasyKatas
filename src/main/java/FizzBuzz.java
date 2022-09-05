public class FizzBuzz {
    public String transform(int number) {

        if(isMultipleOf5(number) && isMultipleOf3(number)){
            return "FizzBuzz";
        }

        else if (isMultipleOf3(number)){
            return "Fizz";
        }
        else if (isMultipleOf5(number)){
            return "Buzz";
        }

        return String.valueOf(number);

    }

    public Boolean isMultipleOf3(int number){
        return number % 3 == 0;
    }

    public Boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }
}


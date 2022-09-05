import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzShould {

    @ParameterizedTest()
    @MethodSource("numberOutputOfNotMultiplesOf3And5")
    void notMultiplesOf3And5(int number, String fizzBuzzOutput) {
        String output = new FizzBuzz().transform(number);
        assertEquals(output, fizzBuzzOutput);
    }

    @ParameterizedTest()
    @MethodSource("numberOutputOfMultiplesOf3Not5")
    void multiplesOf3Not5(int number, String fizzBuzzOutput) {
        String output = new FizzBuzz().transform(number);
        assertEquals(output, fizzBuzzOutput);
    }

    @ParameterizedTest()
    @MethodSource("numberOutputOfMultiplesOf5Not3")
    void multiplesOf5Not3(int number, String fizzBuzzOutput) {
        String output = new FizzBuzz().transform(number);
        assertEquals(output, fizzBuzzOutput);
    }

    @ParameterizedTest()
    @MethodSource("numberOutputOfMultiplesOf5And3")
    void multiplesOf5And3(int number, String fizzBuzzOutput) {
        String output = new FizzBuzz().transform(number);
        assertEquals(output, fizzBuzzOutput);
    }


    private static Stream<Arguments> numberOutputOfNotMultiplesOf3And5() {
        return Stream.of(
                Arguments.arguments(1, "1"),
                Arguments.arguments(2, "2"),
                Arguments.arguments(4, "4")
        );
    }

    private static Stream<Arguments> numberOutputOfMultiplesOf3Not5() {
        return Stream.of(
                Arguments.arguments(3, "Fizz"),
                Arguments.arguments(6, "Fizz"),
                Arguments.arguments(9, "Fizz")
        );
    }

    private static Stream<Arguments> numberOutputOfMultiplesOf5Not3() {
        return Stream.of(
                Arguments.arguments(5, "Buzz"),
                Arguments.arguments(10, "Buzz")
        );
    }

    private static Stream<Arguments> numberOutputOfMultiplesOf5And3(){
        return Stream.of(
                Arguments.arguments(15, "FizzBuzz"),
                Arguments.arguments(30, "FizzBuzz")
        );
    }



}

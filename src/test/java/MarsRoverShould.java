import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MarsRoverShould {

    MarsRover mars;

    @ParameterizedTest()
    @MethodSource("movesNorth")
    void move_forward(String input, String output) {
        mars = new MarsRover(0, 0, "N");
        Assertions.assertEquals(output, mars.move(input));
    }

    @ParameterizedTest()
    @MethodSource("movesSouth")
    void move_backwards(String input, String output) {
        mars = new MarsRover(0, 0, "S");
        Assertions.assertEquals(output, mars.move(input));
    }

    @ParameterizedTest()
    @MethodSource("rotateLeft")
    void rotate_left(String input, String output) {
        mars = new MarsRover(0, 0, "N");
        Assertions.assertEquals(output, mars.move(input));
    }

    @ParameterizedTest()
    @MethodSource("rotateRight")
    void rotate_right(String input, String output) {
        mars = new MarsRover(0, 0, "N");
        Assertions.assertEquals(output, mars.move(input));
    }


    private static Stream<Arguments> movesNorth() {
        return Stream.of(
                Arguments.arguments("M", "0:1:N"),
                Arguments.arguments("MM", "0:2:N"),
                Arguments.arguments("MMM", "0:3:N"),
                Arguments.arguments("MMMM", "0:4:N"),
                Arguments.arguments("MMMMM", "0:5:N"),
                Arguments.arguments("MMMMMM", "0:6:N"),
                Arguments.arguments("MMMMMMM", "0:7:N"),
                Arguments.arguments("MMMMMMMM", "0:8:N"),
                Arguments.arguments("MMMMMMMMM", "0:9:N"),
                Arguments.arguments("MMMMMMMMMM", "0:0:N")
        );
    }

    private static Stream<Arguments> movesSouth() {
        return Stream.of(
                Arguments.arguments("M", "0:9:S"),
                Arguments.arguments("MM", "0:8:S"),
                Arguments.arguments("MMM", "0:7:S"),
                Arguments.arguments("MMMM", "0:6:S"),
                Arguments.arguments("MMMMM", "0:5:S"),
                Arguments.arguments("MMMMMM", "0:4:S"),
                Arguments.arguments("MMMMMMM", "0:3:S"),
                Arguments.arguments("MMMMMMMM", "0:2:S"),
                Arguments.arguments("MMMMMMMMM", "0:1:S"),
                Arguments.arguments("MMMMMMMMMM", "0:0:S")
        );
    }

    private static Stream<Arguments> rotateLeft() {
        return Stream.of(
                Arguments.arguments("L", "0:0:W"),
                Arguments.arguments("LL", "0:0:S"),
                Arguments.arguments("LLL", "0:0:E"),
                Arguments.arguments("LLLL", "0:0:N")
                );
    }

    private static Stream<Arguments> rotateRight() {
        return Stream.of(
                Arguments.arguments("R", "0:0:E"),
                Arguments.arguments("RR", "0:0:S"),
                Arguments.arguments("RRR", "0:0:W"),
                Arguments.arguments("RRRR", "0:0:N")
        );
    }
}

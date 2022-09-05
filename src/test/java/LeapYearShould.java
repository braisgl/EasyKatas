import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearShould {

    @Test
    public void isDivisibleBy4() {
        int number = 400;
        assertTrue(LeapYear.isLeapYear(number));
    }

    @Test
    public void isNotDivisibleBy4() {
        int number = 5;
        assertFalse(LeapYear.isLeapYear(number));
    }

    @Test
    public void isNotDivisibleBy400() {
        int number = 1600;
        assertTrue(LeapYear.isLeapYear(number));
    }

    @Test
    public void isNotDivisibleBy100() {
        int number = 1600;
        assertTrue(LeapYear.isLeapYear(number));
    }

}
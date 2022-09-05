import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StringCalculatorShould {

    StringCalculator calc = new StringCalculator();

    @Test
    public void sumEmptyString() {
        Assertions.assertEquals("0", calc.operate(""));
    }

    @Test
    public void sumSingleOperand() {
        Assertions.assertEquals("1", calc.operate("1"));
    }

    @Test
    public void sumTwoOperands() {
        Assertions.assertEquals("3", calc.operate("1,2"));
    }

    @Test
    public void sumAnIncredibleAmmountOfOperands() {
        Assertions.assertEquals("45", calc.operate("9,5,1,5,8,3,4,2,3,5"));
    }

    @Test
    public void sumWithNewLines() {
        Assertions.assertEquals("15", calc.operate("5\n4,6"));
    }

    @Test
    public void sumWithCustomSeparator() {
        Assertions.assertEquals("3", calc.operate("//;\\n1;2"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void sumWithNegativesReturnsAnError() {
        calc.operate("1,-2,-3");
    }

    @Test
    public void sumIgnoringNumbersAbove1000() {
        Assertions.assertEquals("2",calc.operate("2,1000"));
    }

    @Test
    public void sumWithCustomLengthSeparators() {
        Assertions.assertEquals('6', calc.operate("//[***]\n1***2***3"));
    }
}
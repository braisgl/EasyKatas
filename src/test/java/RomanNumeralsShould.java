import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RomanNumeralsShould {

    RomanNumerals rn = new RomanNumerals();
    @Test
    public void is1(){
        Assertions.assertEquals("I",rn.calculate(1));
    }

    @Test
    public void is2(){
        Assertions.assertEquals("II",rn.calculate(2));
    }

    @Test
    public void is3(){
        Assertions.assertEquals("III",rn.calculate(3));
    }
    @Test
    public void is4(){
        Assertions.assertEquals("IV",rn.calculate(4));
    }
    @Test
    public void is5(){
        Assertions.assertEquals("V",rn.calculate(5));
    }
    @Test
    public void is6(){
        Assertions.assertEquals("VI",rn.calculate(6));
    }
    @Test
    public void is7(){
        Assertions.assertEquals("VII",rn.calculate(7));
    }
    @Test
    public void is8(){
        Assertions.assertEquals("VIII",rn.calculate(8));
    }
    @Test
    public void is9(){
        Assertions.assertEquals("IX",rn.calculate(9));
    }
    @Test
    public void is10(){
        Assertions.assertEquals("X",rn.calculate(10));
    }

}

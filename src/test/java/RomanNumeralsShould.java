import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {

    RomanNumerals rn = new RomanNumerals();
    @Test
    public void is1(){
        assertEquals("I",rn.calculate(1));
    }

    @Test
    public void is2(){
        assertEquals("II",rn.calculate(2));
    }

    @Test
    public void is3(){
        assertEquals("III",rn.calculate(3));
    }
    @Test
    public void is4(){
        assertEquals("IV",rn.calculate(4));
    }
    @Test
    public void is5(){
        assertEquals("V",rn.calculate(5));
    }
    @Test
    public void is6(){
        assertEquals("VI",rn.calculate(6));
    }
    @Test
    public void is7(){
        assertEquals("VII",rn.calculate(7));
    }
    @Test
    public void is8(){
        assertEquals("VIII",rn.calculate(8));
    }
    @Test
    public void is9(){
        assertEquals("IX",rn.calculate(9));
    }
    @Test
    public void is10(){
        assertEquals("X",rn.calculate(10));
    }

}

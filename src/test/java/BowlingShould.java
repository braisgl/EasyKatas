import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Hey Niko! It's Roman, let's test the bowling parlour!
public class BowlingShould {

    Bowling bowling = new Bowling();

    @Test
    public void normalPunctuation() {
        assertEquals(90, bowling.addTurnResult("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||"));
    }

    @Test
    public void proLevel1Spare() {
        assertEquals(150, bowling.addTurnResult("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5"));
    }

    @Test
    public void proLevel2Strike() {
        assertEquals(300, bowling.addTurnResult("X|X|X|X|X|X|X|X|X|X||XX"));
    }

    @Test
    public void proLevel3SpareWithOtherValues() {
        assertEquals(116, bowling.addTurnResult("5/|56|6-|7-|34|87|34|7/|6/|45||6"));
    }
}
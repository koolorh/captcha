import kata.KataRange;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class KataRangeTest {

    @Test
    public void resultShouldBeInclusiveAtStart() {
        KataRange kataRange = new KataRange("[0,5]");
        assertTrue(kataRange.isStartWithInclusive());
    }

    @Test
    public void resultShouldBeExclusiveAtStart() {
        KataRange kataRange = new KataRange("{0,5]");
        assertFalse(kataRange.isStartWithInclusive());
    }

    @Test
    public void resultShouldBeInclusiveAtEnd() {
        KataRange kataRange = new KataRange("[0,5]");
        assertTrue(kataRange.isEndWithInclusive());
    }

    @Test
    public void resultShouldBeExclusiveAtEnd() {
        KataRange kataRange = new KataRange("(0,5}");
        assertFalse(kataRange.isEndWithInclusive());
    }

    @Test
    public void resultShouldBeStartWith0WhenInputStartWithInclusive0() {
        KataRange kataRange = new KataRange("[0,5]");
        assertEquals(0, kataRange.getStartRange());
    }

    @Test
    public void resultShouldBeStartWith1WhenInputStartWithExclusive0() {
        KataRange kataRange = new KataRange("(0,5]");
        assertEquals(1, kataRange.getStartRange());
    }

    @Test
    public void resultShouldBeStartWith1WhenInputStartWithInclusive1() {
        KataRange kataRange = new KataRange("[1,5]");
        assertEquals(1, kataRange.getStartRange());
    }
}

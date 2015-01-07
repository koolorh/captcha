import org.junit.Test;
import util.Randomizer;

import static org.junit.Assert.*;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class RandomizerTest {

    private Randomizer randomizer = new Randomizer();

    @Test
    public void getPatternShouldBy1WhenInputIs1() {
        assertTrue(randomizer.getPattern() <= 2);
    }

    @Test
    public void getPatternShouldBy2WhenInputIs2() {
        assertTrue(randomizer.getPattern() <= 2);
    }

    @Test
    public void getOperandShouldBetweenOneAndNine() {
        int randomOperand = randomizer.getOperand();
        assertTrue(randomOperand >= 1 && randomOperand <= 9);
    }

    @Test
    public void getOperatorShouldBetweenOneAndThree() {
        int randomOperator = randomizer.getOperator();
        assertTrue(randomOperator >= 1 && randomOperator <= 3);
    }
}

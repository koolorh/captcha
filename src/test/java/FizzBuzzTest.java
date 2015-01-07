import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class FizzBuzzTest {

    @Test
    public void getResultShouldBe1WhenInputIs1() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertEquals("1", fizzBuzz.getResult());
    }

    @Test
    public void getResultShouldBe2WhenInputIs2() {
        FizzBuzz fizzBuzz = new FizzBuzz(2);
        assertEquals("2", fizzBuzz.getResult());
    }

    @Test
    public void getResultShouldBeFizzWhenInputIs3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzBuzz.getResult());
    }

    @Test
    public void getResultShouldBeBuzzWhenInputIs5() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertEquals("Buzz", fizzBuzz.getResult());
    }

    @Test
    public void getResultShouldBeFizzWhenInputIs6() {
        FizzBuzz fizzBuzz = new FizzBuzz(6);
        assertEquals("Fizz", fizzBuzz.getResult());
    }

    @Test
    public void getResultShouldBeFizzBuzzWhenInputIs15() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertEquals("FizzBuzz", fizzBuzz.getResult());
    }
}

import model.Captcha;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class CaptchaTest {


    @Test
    public void getLeftOpShouldBe1WhenInputIs1AndPatternIs1(){
        Captcha captcha = new Captcha(1,1,1,1);
        assertEquals("1", captcha.getLeft().toString());

    }

    @Test
    public void getLeftOpShouldBe9WhenInputIs9AndPatternIs1(){
        Captcha captcha = new Captcha(1,9,1,1);
        assertEquals("9", captcha.getLeft().toString());

    }

    @Test
    public void getLeftOpShouldBeOneWhenInputIs1AndPatternIs2(){
        Captcha captcha = new Captcha(2,1,1,1);
        assertEquals("One", captcha.getLeft().toString());

    }

    @Test
    public void getLeftOpShouldBeNineWhenInputIs9AndPatternIs2(){
        Captcha captcha = new Captcha(2,9,1,1);
        assertEquals("Nine", captcha.getLeft().toString());

    }

    @Test
    public void getOperatorShouldBePlugWhenInput1(){
        Captcha captcha = new Captcha(1,1,1,1);
        assertEquals("+", captcha.getOperator().toString());

    }

}

import static junit.framework.Assert.assertEquals;

import model.StringOperand;
import org.junit.Test;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class StringIntegerOperandTest {
    @Test
    public void getStringOperandShouldBeOneWhenInputIs1(){
        StringOperand stringOperand = new StringOperand(1);
        assertEquals("One", stringOperand.toString());

    }

    @Test
    public void getStringOperandShouldBeTwoWhenInputIs2(){
        StringOperand stringOperand = new StringOperand(2);
        assertEquals("Two", stringOperand.toString());

    }

    @Test
    public void getStringOperandShouldBeNineWhenInputIs9(){
        StringOperand stringOperand = new StringOperand(9);
        assertEquals("Nine", stringOperand.toString());

    }
}

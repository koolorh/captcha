import model.IntegerOperand;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by cadet on 1/6/15 AD.
 */
public  class IntegerIntegerOperandTest {


    @Test
    public void toStringShouldReturn1WhenInputIs1(){
        IntegerOperand integerOperand = new IntegerOperand(1);
        assertEquals("1", integerOperand.toString());
    }
}

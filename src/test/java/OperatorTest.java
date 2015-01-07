import model.Operator;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
/**
 * Created by cadet on 1/6/15 AD.
 */
public class OperatorTest {
    @Test
    public void operatorShouldBePlusWhenInputIs1(){
        Operator operator = new Operator(1);
        assertEquals("+",operator.toString());
    }

    @Test
    public void operatorShouldBeMultiplyWhenInputIs2(){
        Operator operator = new Operator(2);
        assertEquals("*",operator.toString());
    }

    @Test
    public void operatorShouldBexxxWhenInputIs2(){
        Operator operator = new Operator(3);
        assertEquals("-",operator.toString());
    }
}

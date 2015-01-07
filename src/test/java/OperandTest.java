import model.Operand;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class OperandTest {
    @Test
    public void crateIntegerOperandWhenPatternis1AndLeftRightis1(){
        Operand operand = Operand.createLeft(1,1);
        Assert.assertEquals("1",operand.toString());
    }

    @Test
    public void crateStringOperandWhenPatternis1AndLeftRightis1(){
        Operand operand = Operand.createLeft(2,1);
        Assert.assertEquals("One",operand.toString());
    }

    @Test
    public void crateStringOperandWhenPatternis2AndLeftRightis1(){
        Operand operand = Operand.createRight(2,1);
        Assert.assertEquals("1",operand.toString());
    }

    @Test
    public void crateIntegerOperandWhenPatternis2AndLeftRightis2(){
        Operand operand = Operand.createRight(1,1);
        Assert.assertEquals("One",operand.toString());
    }
}

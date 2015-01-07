package model;

/**
 * Created by cadet on 1/6/15 AD.
 */
public abstract class Operand {
    public int operand;
    private static final int LEFT = 1;
    private static final int RIGHT = 2;

    public abstract String toString();

    private static Operand createOperand(int pattern,int oprandValue,int leftRight){
        Operand result = null;
        if(leftRight == LEFT) {
            if(isIntegerPattern(pattern)) {
                result = new IntegerOperand(oprandValue);
            } else {
                result = new StringOperand(oprandValue);
            }
        } else {
            if(isIntegerPattern(pattern)) {
                result = new StringOperand(oprandValue);
            } else {
                result = new IntegerOperand(oprandValue);
            }
        }

        return result;
    }

    public static Operand createLeft(int pattern, int operand) {
        return createOperand(pattern, operand, LEFT);
    }

    public static Operand createRight(int pattern, int operand) {
        return createOperand(pattern, operand, RIGHT);
    }

    private static  boolean isIntegerPattern(int pattern){
        return pattern ==1;
    }
}

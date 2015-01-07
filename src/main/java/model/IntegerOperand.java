package model;

import model.Operand;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class IntegerOperand extends Operand {
    public IntegerOperand(int operand){
        this.operand = operand;

    }

    public String toString(){
        return String.valueOf(this.operand);
    }
}

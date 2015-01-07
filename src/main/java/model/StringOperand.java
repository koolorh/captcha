package model;

import model.Operand;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class StringOperand extends Operand {

    public StringOperand(int operand){
        this.operand = operand;
    }

    public String toString(){
        String[] arrStr = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int indexToStr = this.operand -1;
        return arrStr[indexToStr];

    }
}

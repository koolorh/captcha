package model;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class Operator {
    private int operator;
    private String[] arrStr = {"+","*","-"};

    public Operator(int operator){
        this.operator = operator;

    }

    public String toString(){
        int indexOfArr = this.operator -1 ;
        return arrStr[indexOfArr];
    }
}

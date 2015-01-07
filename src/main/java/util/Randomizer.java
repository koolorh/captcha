package util;

import java.util.Random;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class Randomizer {

    public Randomizer() {

    }

    public int getPattern() {
        return randomNumber(1, 2);
    }

    public int getOperand() {
        return randomNumber(1, 9);
    }

    public int getOperator() {
        return randomNumber(1, 3);
    }

    private int randomNumber(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return randomNumber;
    }
}

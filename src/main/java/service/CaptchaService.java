package service;

import model.Captcha;
import util.Randomizer;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class CaptchaService {

    private Randomizer randomizer;
    private Logger logger;

    public Captcha randomCaptcha() {
        int pattern = randomizer.getPattern();
        int operator = randomizer.getOperator();
        int leftOperand = randomizer.getOperand();
        int rightOperand = randomizer.getOperand();
        Captcha captcha = new Captcha(pattern, leftOperand, operator, rightOperand);
        logger.persist("something");

        return captcha;
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}

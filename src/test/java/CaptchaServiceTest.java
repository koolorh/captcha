import service.AisLogger;
import service.CaptchaService;
import model.Captcha;
import org.junit.Test;
import service.Logger;
import util.Randomizer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class CaptchaServiceTest {

    @Test
    public void resultShouldBe1PlusOneWhenInputIs1111() {
        CaptchaService captchaService = new CaptchaService();
        AisLogger aisLogger = mock(AisLogger.class);
        captchaService.setLogger(aisLogger);
        captchaService.setRandomizer(getRandomizer());
        Captcha captcha = captchaService.randomCaptcha();

        assertEquals("1 + One", captcha.getLeft() + " " + captcha.getOperator() + " " + captcha.getRight());
    }

    @Test
    public void resultShouldBe2PlusOneWhenInputIs1211() {
        CaptchaService captchaService = new CaptchaService();
        AisLogger aisLogger = mock(AisLogger.class);
        captchaService.setLogger(aisLogger);
        captchaService.setRandomizer(getRandomizer());
        Captcha captcha = captchaService.randomCaptcha();

        assertEquals("1 + One", captcha.getLeft() + " " + captcha.getOperator() + " " + captcha.getRight());
    }

    @Test
    public void callAisLoggerOnce() {
        CaptchaService captchaService = new CaptchaService();
        Logger logger = mock(AisLogger.class);
        captchaService.setLogger(logger);


        captchaService.setRandomizer(getRandomizer());
        Captcha captcha = captchaService.randomCaptcha();

        verify(logger, times(1)).persist("something");
    }

    public static Randomizer getRandomizer() {
        Randomizer randomizer = mock(Randomizer.class);
        when(randomizer.getPattern()).thenReturn(1);
        when(randomizer.getOperator()).thenReturn(1);
        when(randomizer.getOperand()).thenReturn(1);

        return randomizer;
    }
}

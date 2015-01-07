import controller.CaptchaController;
import org.junit.Test;
import service.CaptchaService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class CaptchaControllersTest {
    @Test
    public void callCaptchaServiceOnce(){
        CaptchaController controller = new CaptchaController();
        CaptchaService captchaService = mock(CaptchaService.class);
        controller.setCaptchaService(captchaService);
        controller.callCaptchaService();
        verify(captchaService,times(1)).randomCaptcha();
    }
}

package controller;

import model.Captcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CaptchaService;

/**
 * Created by cadet on 1/7/15 AD.
 */
@RestController
public class CaptchaController {
    private CaptchaService captchaService;

    @Autowired
    public void setCaptchaService(CaptchaService captchaService) {
        this.captchaService = captchaService;
    }

    @RequestMapping("/captcha")
    public String callCaptchaService() {
        return this.captchaService.randomCaptcha().toString();
    }
}

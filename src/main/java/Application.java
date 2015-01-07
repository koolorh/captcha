import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import service.AisLogger;
import service.CaptchaService;
import service.Logger;
import util.Randomizer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by cadet on 1/7/15 AD.
 */

@ComponentScan
@EnableAutoConfiguration
public class Application {
    @Bean
    Randomizer randomizer() {
        return new Randomizer();
    }

    @Bean
    BufferedWriter bufferedWriter() {
        try {
            File file = new File("filename.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            return new BufferedWriter(fw);
        } catch (IOException e) {
            return null;
        }

    }

    @Bean
    CaptchaService captchaService() {
        CaptchaService captchaService = new CaptchaService();
        captchaService.setRandomizer(randomizer());
        captchaService.setLogger(logger());
        return captchaService;
    }
    @Bean
    Logger logger(){
        Logger logger = new AisLogger(bufferedWriter());
        return logger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}


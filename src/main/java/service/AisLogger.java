package service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class AisLogger implements Logger{
    private BufferedWriter bw;

    public AisLogger(BufferedWriter bw) {
        this.bw = bw;
    }

    @Override
    public void persist(String content) {
        try {
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

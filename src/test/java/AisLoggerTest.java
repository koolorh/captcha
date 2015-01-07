import org.junit.Test;
import org.mockito.Mock;
import service.AisLogger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class AisLoggerTest {
    @Test
    public void printDate() throws IOException {
        String content = "test";
        BufferedWriter stubBW = mock(BufferedWriter.class);

        AisLogger aisLogger = new AisLogger(stubBW);
        aisLogger.persist(content);
        verify(stubBW, times(1)).write(content);
    }
}

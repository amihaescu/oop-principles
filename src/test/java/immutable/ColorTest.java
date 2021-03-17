package immutable;

import com.amihaescu.immutable.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColorTest {

    @Test
    void blue_and_red_should_be_purple() {
        var blue = new Color(0, 0 ,255); // RGB
        var purple = blue.setRed(255);
        assertEquals(0, blue.getRed());
        assertEquals(255, blue.getBlue());
        assertEquals(255, purple.getRed());
        assertEquals(255, purple.getBlue());
    }
}

package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstClass {
    @Test
    void firstTest() {
        Assertions.assertFalse(3 < 2);
    }

    @Test
    void second_firstTest() {
        Assertions.assertFalse(3 < 2);
    }
}

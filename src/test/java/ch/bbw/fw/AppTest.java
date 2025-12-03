package ch.bbw.fw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void greetShouldIncludeName() {
        assertEquals("Hello World", App.greet("World"));
    }
}

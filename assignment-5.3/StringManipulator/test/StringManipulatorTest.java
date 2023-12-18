import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void concatenate() {
        assertEquals("Hello World!", StringManipulator.concatenate("Hello ", "World!"));
    }

    @Test
    void findLength() {
        assertEquals(12, StringManipulator.findLength("Hello World!"));
    }

    @Test
    void convertToUpperCase() {
        assertEquals("HELLO WORLD!", StringManipulator.convertToUpperCase("hello WoRlD!"));
    }

    @Test
    void convertToLowerCase() {
        assertEquals("hello world!", StringManipulator.convertToLowerCase("HELLo wORlD!"));
    }

    @Test
    void containsSubstring() {
        assertTrue(StringManipulator.containsSubstring("Hello World!", "rld!"));
    }
}
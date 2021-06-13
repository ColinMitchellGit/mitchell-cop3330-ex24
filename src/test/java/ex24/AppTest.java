package ex24;

import org.junit.jupiter.api.Test;

import static ex24.App.isAnagram;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    @Test
    void main() {
    }

    @Test
    void testisAnagram() {
        assertTrue(isAnagram("note", "tone"));
    }
}

package se.Iths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TextProcessorTest {

    @Test
    public void testUpperCase(){
        TextProcessor textProcessor = new TextProcessor();

        assertEquals("TJENNA",textProcessor.upperCase("tjenna"));
    }

    @Test
    public void testLowerCase(){
        TextProcessor textProcessor = new TextProcessor();
        assertNotEquals("TJENNA",textProcessor.lowerCase("tjenna"));
    }

    @Test
    public void testReverse(){
        TextProcessor textProcessor = new TextProcessor();
        assertNotEquals("Hallå",textProcessor.reverse("Hallå"));
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SillyTextTest {
    SillyText sillyText = new SillyText();

    @Test
    public void withNull() {
        runTest(null, null);
    }

    private void runTest(String input, String expectedOutput) {
        assertEquals(expectedOutput, sillyText.sillyfy(input));
    }
}
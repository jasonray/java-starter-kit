import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SillyTextTest {
    SillyText sillyText = new SillyText();

    @Test
    public void withNull() {
        runTest(null, null);
    }

    @Test
    public void withEmptyString() {
        runTest("", "");
    }

    private void runTest(String input, String expectedOutput) {
        assertEquals(expectedOutput, sillyText.sillyfy(input));
    }
}
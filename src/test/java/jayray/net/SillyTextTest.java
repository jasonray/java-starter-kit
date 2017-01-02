package jayray.net;

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

    @Test
    public void oTo0() {
        runTest("o", "0");
    }

    @Test
    public void OTo0() {
        runTest("O", "0");
    }

    private void runTest(String input, String expectedOutput) {
        assertEquals(expectedOutput, sillyText.sillyfy(input));
    }
}
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        String s2 = getClassString().toLowerCase();
        assertTrue("Expected word not found!", s2.contains("hello"));
    }

    @Test
    public void testGetClassNumber() {
        int expected = 45;

        if(getClassNumber() < expected) {
            Assert.fail("Number is not greater than " + expected);
        }
    }

    @Test
    public void testGetLocalNumber() {
        assertEquals("Number should be equal to 14", 14, getLocalNumber());
    }
}

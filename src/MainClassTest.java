import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest extends MainClass {

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

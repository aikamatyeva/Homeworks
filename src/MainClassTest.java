import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest extends MainClass{

    @Test
    public void testGetLocalNumber(){
        assertEquals("Number should be equal to 14", 14, this.getLocalNumber());
    }
}

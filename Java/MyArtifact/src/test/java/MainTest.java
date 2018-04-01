import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void fizzbuzz() {
        assertEquals("fizzbuzz", Main.fizzbuzz(15, ""));
    }
    @Test
    public void fizz() {
        assertEquals("fizz", Main.fizzbuzz(3, ""));
    }
    @Test
    public void buzz() {
        assertEquals("buzz", Main.fizzbuzz(51, ""));
    }
}
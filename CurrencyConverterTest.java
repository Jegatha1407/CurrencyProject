import static org.junit.Assert.*;
import org.junit.Test;

public class CurrencyConverterTest {

    CurrencyConverter c = new CurrencyConverter();

    @Test
    public void testInrToUsd() {
        assertEquals(1.0, c.inrToUsd(83), 0.1);
    }

    @Test
    public void testUsdToInr() {
        assertEquals(83.0, c.usdToInr(1), 0.1);
    }

    @Test
    public void testInrToEur() {
        assertEquals(1.0, c.inrToEur(90), 0.1);
    }

    @Test
    public void testEurToInr() {
        assertEquals(90.0, c.eurToInr(1), 0.1);
    }
}
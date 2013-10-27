import org.junit.Test;

import java.text.DecimalFormat;
import java.text.ParseException;

import static org.junit.Assert.*;

public class EuroTest {

    @Test
    public void two10EurosShouldBeEqual()
    {
        assertEquals(new Euro(10), new Euro(10));
    }

    @Test
    public void twoDifferentEurosShouldNotBeEqual() {
        assertFalse(new Euro(10).equals(new Euro(9)));
    }

    @Test
    public void tenEurosShouldEqualTwoFiveEuros(){
        assertEquals(new Euro(10), new Euro(5).add(new Euro(5)));
    }

    @Test
    public void tenEurosShouldNotEqualTenDollars()
    {
        assertFalse(new Euro(10).equals(new Dollar(10)));
    }

    @Test
    public void tenEurosShouldEqualThirteenHalfDollars() {
        assertTrue(new Euro(10).equals(new Dollar(13.5)));
    }

    @Test
    public void tenEuroShouldEqual740Point76Rupees() throws ParseException {
        assertTrue(new Euro(10).equals(new Rupees(740.76)));
    }
}
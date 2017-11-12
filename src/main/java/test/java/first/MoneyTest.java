package test.java.first;

import first.Dollar;
import first.Flanc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertTrue(new Flanc(5).equals(new Flanc(5)));
        assertFalse(new Flanc(5).equals(new Flanc(6)));
    }
    @Test
    public void testFrancMultiplication() {
        Flanc five = new Flanc(5);
        assertEquals(new Flanc(10), five.times(2));
        assertEquals(new Flanc(15), five.times(3));
    }

}

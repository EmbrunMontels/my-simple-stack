package deqo.emon.mysimplestack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item i1;
    private  Item i2;
    @Before //fixture
    public void init(){
        i1 = new Item(12);
        i2 = new Item(0);
    }

    @Test
    public void testGetValeur() {
        //code à test
        int val = i1.getValeur();
        //assertions (oracle)
        assertTrue((val == 12));
        assertFalse(val < 0);
    }

    @Test
    public void testSetValeur() {
        //code à test
        i2.setValeur(45);
        //assertions (oracle)
        assertEquals(45, i2.getValeur());
        assertFalse(i2.getValeur() < 0);
    }
}
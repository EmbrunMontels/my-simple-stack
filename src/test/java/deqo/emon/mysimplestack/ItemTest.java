package deqo.emon.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {


    @Test
    public void getValeur() {
        Item item = new Item(12);
        //code à test
        int val = item.getValeur();
        //assertions (oracle)
        assertTrue(( val == 12) );
    }

    @Test
    public void setValeur() {
    }
}
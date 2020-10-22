package deqo.emon.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SimpleStackTest {
    private SimpleStack stack;
    private  SimpleStack stack2;
    private Item i;

    @Before
    public void init(){
        stack = new SimpleStack();
        stack2 = new SimpleStack();
        i = new Item(13);
        stack2.push(i);
    }
    @Test
    public void testIsEmpty() {
        //code à test
        SimpleStack s1 = new SimpleStack();
        boolean empty = s1.isEmpty();
        //assertions
        assertTrue(empty);
        assertEquals("a new stack should be empty",0,stack.getSize());
    }

    @Test
    public void testGetSize() {
        //code à test
        int size = stack.size;
        //assertions
        assertEquals(0,size);
    }

    @Test
    public void testPush() {
        //code à test
        stack.push(i);
        Item item = stack.peek();
        //assetions
        assertEquals(1,stack.getSize());
    }

    @Test
    public void tesstPeek() {
        //code à test
        stack2.peek();
        //assertions
        assertEquals(i,stack2.peek());
        assertFalse(stack2.getSize() == 0);
    }

    @Test
    public void testPop() {
        //code à test
        Item item = stack2.peek();
        stack2.pop();
        //assertions
        assertEquals(i,item);
        assertTrue(stack.getSize() == 0);

    }
}
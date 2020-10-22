package deqo.emon.mysimplestack;

import java.awt.*;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class SimpleStack implements ISimpleStack {
     ArrayList<Item> stack;
     int size;
    public SimpleStack() {
        this.size = 0;
        this.stack = new ArrayList<Item>(0);
    }



    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(Item item) {
    this.stack.add(item);
    size+=1;
    }

    @Override
    public Item peek() throws EmptyStackException {
            System.out.println("first element is : " + stack.get(0));
            return stack.get(0);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item item = stack.get(0);
        stack.remove(0);
        size-=1;
        return item;
    }
}

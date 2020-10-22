package deqo.emon.mysimplestack;

import java.awt.*;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class SimpleStack implements ISimpleStack {
     ArrayList<Item> stack;
     int size;
    public SimpleStack(int size) {
        this.size = size;
        this.stack = new ArrayList<Item>(size);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {
    this.stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (!isEmpty()){
            System.out.println("first element is : " + stack.get(0));
            return stack.get(0);
        }
        System.out.println("Error, the stack is empty");
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item item = stack.get(0);
        stack.remove(0);
        return item;
    }
}

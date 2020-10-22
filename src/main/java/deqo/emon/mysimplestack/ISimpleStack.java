package deqo.emon.mysimplestack;

import java.util.EmptyStackException;

public interface ISimpleStack {
    /**
     * test if the stack is empty.
     *
     */
    public boolean isEmpty();

    /**
     * returns the number of items on this stack.
     *
     */
    public int getSize();

    /**
     * pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item
     */
    public void push(Item item);

    /**
     * looks at the object at the top of this stack without removing it from the stack.
     * @return
     * @throws EmptyStackException
     */
    public Item peek() throws EmptyStackException;

    /**
     * remove the object at the top of the stack and return that object as the value of this function.
     * @return
     * @throws EmptyStackException
     */
    public Item pop() throws EmptyStackException;

}

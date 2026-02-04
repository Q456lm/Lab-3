import java.util.ArrayList;

/**
 * Lab: GenericStack
 * 
 * A generic stack implementation using ArrayList.
 * Students will implement all methods.
 */
public class GenericStack<E> {
    
    private ArrayList<E> list = new ArrayList<>();
    
    /**
     * TODO: Implement this method.
     * Hint: Add the element to the end of the list (top of stack).
     */
    public void push(E element) {
        System.out.println("TODO: push() not implemented yet");
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Remove and return the last element (top of stack).
     * Return type is E.
     */
    public E pop() {
        System.out.println("TODO: pop() not implemented yet");
        return null;
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return the last element without removing it.
     * Return type is E.
     */
    public E peek() {
        System.out.println("TODO: peek() not implemented yet");
        return null;
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return the number of elements in the stack.
     */
    public int getSize() {
        System.out.println("TODO: getSize() not implemented yet");
        return 0;
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return true if the stack is empty.
     */
    public boolean isEmpty() {
        System.out.println("TODO: isEmpty() not implemented yet");
        return false;
    }
    
    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}

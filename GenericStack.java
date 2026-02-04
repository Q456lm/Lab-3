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
     * Hint: Add the element to the end of the list (top of stack).
     */
    public void push(E element) {list.add(element);}
    
    /**
     * Hint: Remove and return the last element (top of stack).
     * Return type is E.
     */

    public E pop() {
        E last_element = list.get(list.size()-1);
        list.remove(list.size()-1);
        return last_element;
    }
    
    /**
     * Hint: Return the last element without removing it.
     * Return type is E.
     */
    public E peek() {
        E last_element = list.get(list.size()-1);
        return last_element;
    }
    
    /**
     * Hint: Return the number of elements in the stack.
     */
    public int getSize() {
        return list.size();
    }
    
    /**
     * Hint: Return true if the stack is empty.
     */
    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}

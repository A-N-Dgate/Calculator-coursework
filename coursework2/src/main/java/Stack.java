

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class encapsulates a stack abstract data structure.
 * 
 * @author Anusha Din
 */
public class Stack {
  private int size;
  private ArrayList<Entry> stackList;

  /**
   * Constructor for stack, which initialises the size as 0 and the stack array.
   */
  public Stack() {
    this.size = 0;
    this.stackList = new ArrayList<Entry>();
  }

  /**
   * The getter method to return the size of the stack.
   * 
   * @return integer size of the stack.
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Pushes an Entry object onto the stack.
   * 
   * @param a The Entry object.
   */
  public void push(Entry a) {
    // adds the entry, then increments the size
    this.stackList.add(a);
    this.size++;
  }

  /**
   * Removes and returns (pops) the item at the top of the stack.
   * 
   * @return The Entry object at the top of the stack.
   * @throws EmptyStackException if the stack is empty.
   */
  public Entry pop() throws EmptyStackException {
    // the top of the stack will be placed at index (size - 1) as lists are 0 indexed
    // meaning the first item has index 0
    int itemIndex = this.size - 1;

    // putting in an if statement here to avoid the IndexOutOfBounds exception which isn't
    // specified in the uml
    if (itemIndex < 0) {
      EmptyStackException e = new EmptyStackException();
      throw e;
    }

    Entry poppedEntry = this.stackList.remove(itemIndex);
    this.size--;
    return poppedEntry;
  }

  /**
   * Returns the top entry on the stack without removing it.
   * 
   * @return The Entry object at the top of the stack.
   * @throws EmptyStackException if the stack is empty.
   */
  public Entry top() throws EmptyStackException {
    // finding the top of the stack the same as before
    int itemIndex = this.size - 1;
    Entry topEntry = this.stackList.get(itemIndex);
    return topEntry;
  }


}



/**
 * This class represents an entry into the stack.
 * 
 * @author Anusha Din
 */
public class Entry {

  private int number;
  private Symbol symbol;

  /**
   * Constructor taking an integer argument.
   * 
   * @param number The number that the entry represents in the stack.
   */
  public Entry(int number) {
    this.number = number;
    this.symbol = null;
  }

  /**
   * Constructor taking an argument of type Symbol (enum).
   * 
   * @param symbol The symbol that the entry represents in the stack.
   */
  public Entry(Symbol symbol) {
    this.number = 0;
    this.symbol = symbol;
  }

  /**
   * The getter method to get the number that the entry represents.
   * 
   * @return integer number.
   */
  public int getValue() {
    return this.number;
  }

  /**
   * The getter method to get the symbol that the entry represents.
   * 
   * @return enum symbol.
   */
  public Symbol getSymbol() {
    return this.symbol;
  }

  // nothing should error if a number is returned from a symbol, and the other way around
  // I was unsure how to use exceptions, so I thought this could be handled in the code
  // that implements the calculator.


  /**
   * Method to check if two entry objects are equal.
   *
   * @param a The entry that is being compared to
   */
  @Override
  public boolean equals(Object a) {
    // I don't think a type check is needed here, because
    // if object a isn't an entry, the strings would be different.
    // so only if the strings are equal are checked
    return this.toString().equals(a.toString());
  }


  // not sure how to implement the hashCode method, so I left that out, sorry.

  /**
   * This toString returns the string representation of the entry, depending on whether it includes
   * a symbol value or not.
   * 
   * @return string to represent the entry object.
   */
  @Override
  public String toString() {
    // set this string to the string that would be returned by the method
    String returnString;

    // if the symbol attribute is null, the entry must be a number.
    // So set returnString to the number.
    if (this.symbol == null) {
      returnString = String.valueOf(this.number);
    } else {
      // if symbol is not null, set the returnString to the toString of the symbol attribute.
      returnString = symbol.toString();
    }

    return returnString;
  }

}

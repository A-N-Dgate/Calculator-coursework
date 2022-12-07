


/**
 * Enum used to represent mathematical symbols in the stack.
 * 
 * @author Anusha Din
 */
public enum Symbol {
  LEFT_BRACKET("Left bracket"), RIGHT_BRACKET("Right bracket"), TIMES("Times"), DIVIDE(
      "Divide"), PLUS("Plus"), MINUS("Minus"), INVALID("Invalid");

  private String name;

  /**
   * Private constructor for including a string field name.
   * 
   * @param name The name of the enum with only the first letter capitalised.
   */
  private Symbol(String name) {
    this.name = name;
  }

  /**
   * toString changed to print out the name with only the first letter capitalised.
   * 
   * @return string name attribute.
   */
  @Override
  public String toString() {
    return this.name;
  }

  private static Symbol[] getAllSymbols() {
    Symbol[] returnArr = new Symbol[] {Symbol.RIGHT_BRACKET, Symbol.LEFT_BRACKET, Symbol.TIMES,
        Symbol.DIVIDE, Symbol.PLUS, Symbol.MINUS, Symbol.INVALID};
    return returnArr;
  }

  /**
   * Static method used to obtain a symbol enum from a string.
   * 
   * @param symbolName The string  name of the symbol enum you want to use
   * @return the symbol enum corresponding to the string parameter
   */
  public static Symbol matchSymbol(String symbolName) {
    // if a match isn't found, invalid will be returned
    Symbol returnSymbol = Symbol.INVALID;
    Symbol[] symbols = getAllSymbols();

    for (Symbol symbol : symbols) {
      if (symbol.toString().equals(symbolName)) {
        returnSymbol = symbol;
      }
    }

    return returnSymbol;
  }

}

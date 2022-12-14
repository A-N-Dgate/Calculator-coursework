import java.util.EmptyStackException;

/**
 * Calculating the answer to the expression entered in the reverse polish notation.
 * 
 * @author Anusha Din
 *
 */
public class RevPolishCalc {
  private Stack calculatorStack;

  /**
   * Constructor for the class, taking no parameters.
   */
  public RevPolishCalc() {
    calculatorStack = new Stack();
  }

  private boolean isNumber(String num) {
    // need to check if the string is a number to create the entry instances
    try {
      int number = Integer.parseInt(num);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  private void fillStack(String expression) throws EmptyStackException {
    String[] exp = expression.split(" ");

    // this should be later changed to error checking
    if (exp.length == 3) {
      for (String item : exp) {
        if (isNumber(item)) {
          Entry numEnt = new Entry(Integer.parseInt(item));
          this.calculatorStack.push(numEnt);
        } else {
          Symbol sym = Symbol.matchSymbol(item);
          Entry symEnt = new Entry(sym);
          this.calculatorStack.push(symEnt);
        }
      }
    }
  }

  /**
   * Takes an expression calculates the answer.
   * 
   * @param expression that will be evaluated
   * @return the answer to the expression
   */

  public double evaluate(String expression) {
    this.fillStack(expression);


    // revPolish notation = num1 num2 symbol, therefore symbol is on the top of the stack
    double answer = 0;
    try {
      Symbol operation = this.calculatorStack.pop().getSymbol();
      int num2 = this.calculatorStack.pop().getValue();
      int num1 = this.calculatorStack.pop().getValue();


      switch (operation) {
        case PLUS:
          answer = num1 + num2;
          break;
        case MINUS:
          answer = num1 - num2;
          break;
        case TIMES:
          answer = num1 * num2;
          break;
        case DIVIDE:
          answer = num1 / num2;
          break;
        default:
          answer = 0;
      }

    } catch (Exception e) {
      answer = 0;
    }

    return answer;


  }

}

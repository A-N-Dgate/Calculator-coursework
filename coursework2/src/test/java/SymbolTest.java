import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SymbolTest {

  @Test
  void testMatch1() {
    String match1 = "Plus";
    Symbol matched = Symbol.matchSymbol(match1);
    assertEquals(Symbol.PLUS, matched);
  } 
  
  @Test
  void testMatchInvalid() {
    //testing invalid is returned if string doesn't represent a symbol enum
    String matchInv = "Power";
    Symbol matched = Symbol.matchSymbol(matchInv);
    assertEquals(Symbol.INVALID, matched);
  }
  
  @Test
  void testMatch2() {
    String match2 = "Minus";
    Symbol matched = Symbol.matchSymbol(match2);
    assertEquals(Symbol.MINUS, matched);
  }
  
  @Test
  void testMatch3() {
    String match3 = "Divide";
    Symbol matched = Symbol.matchSymbol(match3);
    assertEquals(Symbol.DIVIDE, matched);
  }
  
  @Test
  void testMatch4() {
    String match4 = "Times";
    Symbol matched = Symbol.matchSymbol(match4);
    assertEquals(Symbol.TIMES, matched);
  }
  
  @Test
  void testMatch5() {
    String match5 = "Right bracket";
    Symbol matched = Symbol.matchSymbol(match5);
    assertEquals(Symbol.RIGHT_BRACKET, matched);
  }
  
  @Test
  void testMatch6() {
    String match6 = "Left bracket";
    Symbol matched = Symbol.matchSymbol(match6);
    assertEquals(Symbol.LEFT_BRACKET, matched);
  }
  
  
  

}

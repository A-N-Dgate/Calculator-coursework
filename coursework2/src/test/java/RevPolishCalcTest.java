import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RevPolishCalcTest {
  
  @Test
  void testPlus() {
    RevPolishCalc calc = new RevPolishCalc();
    float answer = calc.evaluate("5 6 Plus");
    assertEquals(11, answer);
  }
  
  @Test
  void testMinus() {
    RevPolishCalc calc = new RevPolishCalc();
    float answer = calc.evaluate("11 9 Minus");
    assertEquals(2, answer);
  }
  
  @Test
  void testDivide() {
    RevPolishCalc calc = new RevPolishCalc();
    float answer = calc.evaluate("25 5 Divide");
    assertEquals(5, answer);
  }
  
  @Test
  void testTimes() {
    RevPolishCalc calc = new RevPolishCalc();
    float answer = calc.evaluate("8 2 Times");
    assertEquals(16, answer);
  }
}

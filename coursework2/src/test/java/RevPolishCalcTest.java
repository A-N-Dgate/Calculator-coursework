import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RevPolishCalcTest {
  
  @Test
  void testPlus() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("5 6 Plus");
    assertEquals(11, answer);
  }
  
  @Test
  void testMinus() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("11 9 Minus");
    assertEquals(2, answer);
  }
  
  @Test
  void testDivide() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("25 5 Divide");
    assertEquals(5, answer);
  }
  
  @Test
  void testTimes() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("8 2 Times");
    assertEquals(16, answer);
  }
  
  @Test
  void testInvalid() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("4 times 5");
    assertEquals(0, answer);
  }
  
  @Test
  void testLetters1() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("6 6 tIMES");
    assertEquals(36, answer);
  }
  
  @Test
  void testLetters2() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("5 5 PlUs");
    assertEquals(10, answer);
  }
  
  @Test
  void testLetters3() {
    RevPolishCalc calc = new RevPolishCalc();
    double answer = calc.evaluate("25 5 dIvIdE");
    assertEquals(5, answer);
  }
}

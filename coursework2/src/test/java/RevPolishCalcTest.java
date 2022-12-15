import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RevPolishCalcTest {
  
  @Test
  void testPlus() {
    double answer = RevPolishCalc.getCalc().evaluate("5 6 Plus");
    assertEquals(11, answer);
  }
  
  @Test
  void testMinus() {
    double answer = RevPolishCalc.getCalc().evaluate("11 9 Minus");
    assertEquals(2, answer);
  }
  
  @Test
  void testDivide() {
    double answer = RevPolishCalc.getCalc().evaluate("25 5 Divide");
    assertEquals(5, answer);
  }
  
  @Test
  void testTimes() {
    double answer = RevPolishCalc.getCalc().evaluate("8 2 Times");
    assertEquals(16, answer);
  }
  
  @Test
  void testInvalid() {
    double answer = RevPolishCalc.getCalc().evaluate("4 times 5");
    assertEquals(0, answer);
  }
  
  @Test
  void testLetters1() {
    double answer = RevPolishCalc.getCalc().evaluate("6 6 tIMES");
    assertEquals(36, answer);
  }
  
  @Test
  void testLetters2() {
    double answer = RevPolishCalc.getCalc().evaluate("5 5 PlUs");
    assertEquals(10, answer);
  }
  
  @Test
  void testLetters3() {
    double answer = RevPolishCalc.getCalc().evaluate("25 5 dIvIdE");
    assertEquals(5, answer);
  }
}

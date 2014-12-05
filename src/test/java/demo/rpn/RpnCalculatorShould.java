package demo.rpn;
 
import static org.junit.Assert.assertEquals;
 
import org.junit.Test;
 
public class RpnCalculatorShould {
    @Test
    public void addTwoNumbersCorreclty() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        rpnCalculator.digit(4);
        rpnCalculator.enter();
        rpnCalculator.digit(9);
        rpnCalculator.operator("+");
        assertEquals(13, rpnCalculator.xRegister());
    }
}
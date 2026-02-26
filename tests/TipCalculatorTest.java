/*
 * LAB 05: Intro to JUnit (PART 1)
 *
 * Create JUnit tests which validate that calculateTip() method for the following scenarios:
 *
 * TEST SCENARIO 1
 * INPUTS: $100.00 bill, 20% tip
 * EXPECTED OUTPUT: $20.00
 *
 * TEST SCENARIO 2
 * INPUTS: $200.00 bill, 25% tip
 * EXPECTED OUTPUT: $50.00
 *
 */

// imports
import org.junit.Assert;
import org.junit.Test;

public class TipCalculatorTest {

    // TEST SCENARIO 1
    @Test
    public void testTipCalculator1(){
        // create instance of TipCalculator
        TipCalculator calculator = new TipCalculator();

        // test calculateTip method
        double result = calculator.calculateTip(100, 20);

        // verify result matches expected value
        Assert.assertEquals(20, result, 0.001);
    }

    // TEST SCENARIO 2
    @Test
    public void testTipCalculator2() {
        // create instance of TipCalculator
        TipCalculator calculator = new TipCalculator();

        // test calculateTip method
        double result = calculator.calculateTip(200, 25);

        // verify result matches expected value
        Assert.assertEquals(50, result, 0.001);
    }

}

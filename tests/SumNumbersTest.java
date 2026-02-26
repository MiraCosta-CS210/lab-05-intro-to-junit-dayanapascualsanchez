/*
 * LAB 05: Intro to JUnit (PART 2)
 *
 * Create JUnit tests which validates the sumIsEven() method for the following scenarios:
 *
 *   TEST SCENARIO 1
 *   INPUTS: 1, 1
 *   EXPECTED OUTPUT: 1 (which represents "true" - meaning the sum of the two numbers is even)
 *
 *   TEST SCENARIO 2
 *   INPUTS: 1, 2
 *   EXPECTED OUTPUT: 0 (which represents "false" - meaning the sum of the two numbers is odd)
 *
 * You will find that your tests aren't passing as expected!  Fix the bug in the sumIsEven method so that
 * it is working the way it should, so that your JUnit tests all pass!
 */

// imports
import org.junit.Assert;
import org.junit.Test;

public class SumNumbersTest {

    // TEST SCENARIO 1
    @Test
    public void testSumIsEven1() {
        // create instance of SumNumbers
        SumNumbers sumNumber = new SumNumbers();

        // test SumIsEven method
        int result = sumNumber.sumIsEven(1,1);

        // verify result matches expected value
        Assert.assertEquals(1, result, 0.001);


    }


    // TEST SCENARIO 2
    @Test
    public void testSumIsEven2() {
        // create instance of SumNumbers
        SumNumbers sumNumber = new SumNumbers();

        // test SumIsEven method
        int result = sumNumber.sumIsEven(1,2);

        // verify result matches expected value
        Assert.assertEquals(0, result, 0.001);

    }

}

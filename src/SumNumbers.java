/*
 * LAB 05: Intro to JUnit (PART 2)
 *
 * Below you will find a sumIsEven() method, but it has some logic problems!
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

public class SumNumbers {

    /*   Define a function called sumIsEven() which takes two integer inputs
     *   and returns 1 for “true” if the sum of the two values is an even number.
     *   If the sum is an odd number, then return 0 for “false.”
     */
    public int sumIsEven(int a, int b) {
        if((a+b) % 2 == 0) { // if there's no remainder (0) after being divided by 2 then it's even
            return 1;
        } else {
            return 0;
        }
    }
}

package com.packtpub;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by vumvo on 11/22/2015.
 */
public class CalculatorTest extends TestCase {

        public void testSum() throws Exception {
            Calculator calculator = new Calculator();
            int sum = calculator.sum(1, 2);
            Assert.assertEquals(3, sum);
        }


        public void testPass() throws Exception {
            Assert.assertEquals(3, 3);
        }

        public void testMultiply() throws Exception {
            Calculator calculator = new Calculator();
            int product = calculator.multiply(2,3);
            Assert.assertEquals(6,product);
        }
}
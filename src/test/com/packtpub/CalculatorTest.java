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
}
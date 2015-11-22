package com.packtpub;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.lang.AssertionError;
import java.lang.Exception;

/**
 * Created by vumvo on 11/22/2015.
 */
public class CalculatorTest extends TestCase {

    public void testSum() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        Assert.assertEquals(3, sum);
    }

    public void testFail() throws Exception {
        Assert.fail("Some bad test has failed");
    }

    public void testPass() throws Exception {
        Assert.assertEquals(3, 3);
    }
}
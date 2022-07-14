package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageAgeTest {
    private AverageAge age;

    @Before
    public void setUp(){
        age = new AverageAge();
    }

    @After
    public void tearDown(){
        age = null;
    }

    @Test
    public void givenAStringArrayWithNumbersAsAgeFindAverageAgeAsResult()
    {
        assertEquals("34.25",age.averageAgeCalculator(new String[]{"35","26","32","44"}));
    }
    @Test
    public void givenAStringArrayWithStringAndNumbersFindAverageAgeAsResult()
    {
        assertEquals("java.lang.NumberFormatException: For input string: \"thirty two\"",age.averageAgeCalculator(new String[]{"35","26","thirty two","44"}));
    }

}
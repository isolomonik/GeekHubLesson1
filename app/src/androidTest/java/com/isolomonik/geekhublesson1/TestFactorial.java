package com.isolomonik.geekhublesson1;

import junit.framework.TestCase;


public class TestFactorial extends TestCase {
    public void testFactorial() throws Exception {
        assertEquals(1, Lesson2Activity.calcFactorial(0));
        assertEquals(1, Lesson2Activity.calcFactorial(1));
        assertEquals(2, Lesson2Activity.calcFactorial(2));
        assertEquals(120, Lesson2Activity.calcFactorial(5));
    }
}

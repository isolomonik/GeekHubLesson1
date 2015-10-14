package com.isolomonik.geekhublesson1;

import junit.framework.TestCase;

public class TestFibonacci extends TestCase {

    public void testFibonacci() throws Exception {
        assertEquals(0, Lesson2Activity.calcFibonacci(0));
        assertEquals(1, Lesson2Activity.calcFibonacci(1));
        assertEquals(1, Lesson2Activity.calcFibonacci(2));
        assertEquals(2, Lesson2Activity.calcFibonacci(3));
        assertEquals(3, Lesson2Activity.calcFibonacci(4));
        assertEquals(5, Lesson2Activity.calcFibonacci(5));
        assertEquals(8, Lesson2Activity.calcFibonacci(6));
        assertEquals(55, Lesson2Activity.calcFibonacci(10));
    }
}
